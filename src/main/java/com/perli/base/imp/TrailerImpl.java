package com.perli.base.imp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import com.perli.base.dto.DataDto;
import com.perli.base.dto.DataRequest;
import com.perli.base.dto.DataResponse;
import com.perli.base.dto.DeleteDto;
import com.perli.base.dto.Pagination;
import com.perli.base.dto.ShortDataResponse;
import com.perli.base.entity.TrailerDetail;
import com.perli.base.entity.Trailers;
import com.perli.base.entity.TrailersList;
import com.perli.base.repository.TrailerDetailRepository;
import com.perli.base.repository.TrailerEmployeesRepository;
import com.perli.base.repository.TrailerRepository;
import com.perli.base.repository.TrailersLRepository;
import com.perli.base.repository.TrailersListRepository;
import com.perli.base.services.TrailerService;
import com.perli.base.constants.*;

@Service
public class TrailerImpl implements TrailerService {

	// private static ModelMapper modelMapper = new ModelMapper();
	@Autowired
	private TrailerRepository trailerRepository;
	@Autowired
	private TrailerEmployeesRepository trailerEmployeesRepository;
	@Autowired
	private TrailersListRepository trailersListRepository;
	@Autowired
	private TrailersLRepository trailersLRepository;
	@Autowired
	private TrailerDetailRepository trailerDetailRepository;

	public Pagination SetPagination(DataRequest dataRequest, Integer numberItems) {
		Pagination pagination = new Pagination();
		pagination.setActualPage(dataRequest.getPagination().getActualPage());
		pagination.setItemPerPage(dataRequest.getPagination().getItemPerPage());
		pagination.setTotal(numberItems);
		Double pagesD = numberItems.doubleValue() / dataRequest.getPagination().getItemPerPage();
		Integer pagesI = numberItems / dataRequest.getPagination().getItemPerPage();
		Double Pages = Double.parseDouble(pagesI.toString());
		if (pagesD.equals(Pages) ) {
			pagination.setPages(pagesI);
		} else {
			pagination.setPages(pagesI + 1);
		}
		return pagination;
	}

	@Override
	public DataResponse getAll(DataRequest dataRequest) {
		DataDto dataDto = new DataDto();
		DataResponse dataResponse = new DataResponse();
		Pageable pageable;
		if (dataRequest.getOrder().getOrder().toString().equals("ASC")) {
			pageable = PageRequest.of(dataRequest.getPagination().getActualPage(),
					dataRequest.getPagination().getItemPerPage(),
					Sort.by(dataRequest.getOrder().getField()).ascending());
		} else {
			pageable = PageRequest.of(dataRequest.getPagination().getActualPage(),
					dataRequest.getPagination().getItemPerPage(),
					Sort.by(dataRequest.getOrder().getField()).descending());
		}
		dataDto.setTrailersList(trailersListRepository.getTrailerNumber(pageable));
		dataResponse.setData(dataDto);
		dataResponse.setPagination(SetPagination(dataRequest, trailersListRepository.getCountTrailers()));
		return dataResponse;
	}

	@Override
	public DataResponse getBy(DataRequest dataRequest) {
		DataResponse dataResponse = new DataResponse();
		DataDto dataDto = new DataDto();		
		switch(dataRequest.getFilter().getField().toString()) {		
		case Constants.TRAILER_UNITNUMBER:
			Integer unitNumber = Integer.parseInt(dataRequest.getFilter().getValue());
			dataDto.setTrailersList(trailersListRepository.getUnitNumber(unitNumber)); 
			break;
		case Constants.TRAILER_LICENSEPLATE:
			dataDto.setTrailersList( trailersListRepository.getLicensePlate (dataRequest.getFilter().getValue() ) ); 
			break;
		case Constants.TRAILER_TRAILERNUMBER:
			Integer trailerNumber = Integer.parseInt(dataRequest.getFilter().getValue());
			dataDto.setTrailersList( trailersListRepository.getTrailerNumber(trailerNumber) );
			break;
		}
		dataResponse.setPagination(SetPagination(dataRequest, 1));
		dataResponse.setData(dataDto);
		return dataResponse;
	}

	@Override
	public DataDto get(Integer idTrailer) {
		DataDto dataDto = new DataDto();
		dataDto.setTrailerDetail(trailerRepository.getByTrailerNumber(idTrailer));
		Pageable pageable = PageRequest.of(0,1);
		dataDto.setTrailerEmployeesPut(trailerEmployeesRepository.getPut(idTrailer,pageable));
		dataDto.setTrailerEmployeesPost(trailerEmployeesRepository.getPost(idTrailer,pageable));
		dataDto.setTrailerEmployeesDelete(trailerEmployeesRepository.getDelete(idTrailer,pageable));
		return dataDto;
	}

	@Override
	public ShortDataResponse delete(DeleteDto deleteDto) {
		ShortDataResponse shortDataResponse = new ShortDataResponse();
		TrailersList trailersList = trailersLRepository.getById(deleteDto.getIdTrailer());
		trailersList.setIdStatusProcess(11);
		trailersList.setDeleteReason(deleteDto.getDeleteReason());
		trailersLRepository.save(trailersList);
		trailersList = trailersLRepository.getById(deleteDto.getIdTrailer());
		if (trailersList.getIdStatusProcess() == 11) {
			shortDataResponse.setMessage(Constants.OK_DELETE_MESSAGE);
			shortDataResponse.setStatusCode(Constants.OK_DELETE);
		}
		return shortDataResponse;
	}

	@Override
	public ShortDataResponse upsert(TrailerDetail trailerDetail) {
		ShortDataResponse shortDataResponse = new ShortDataResponse();
		Trailers trailer = trailerDetail.getTrailers();
		if (trailerDetail.getIdTrailerDetail() == null) {
			trailerDetailRepository.save(trailer);
			Pageable pageable = PageRequest.of(0,1,Sort.by(Constants.TRAILER_ID).descending());
			List<Trailers> trailers = trailerDetailRepository.getLastRecord(pageable);
			trailer = trailers.get(0);
			trailerDetail.setTrailers(trailer);
			trailerRepository.save(trailerDetail);
			shortDataResponse.setMessage(Constants.OK_POST_MESSAGE);
			shortDataResponse.setStatusCode(Constants.OK_POST);
		} else {
			trailerDetailRepository.save(trailer);
			trailerRepository.save(trailerDetail);
			shortDataResponse.setMessage(Constants.OK_PUT_MESSAGE);
			shortDataResponse.setStatusCode(Constants.OK_PUT);
		}
		return shortDataResponse;
	}

}
