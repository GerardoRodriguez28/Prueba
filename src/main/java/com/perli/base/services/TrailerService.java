package com.perli.base.services;

import com.perli.base.dto.DataDto;
import com.perli.base.dto.DataRequest;
import com.perli.base.dto.DataResponse;
import com.perli.base.dto.DeleteDto;
import com.perli.base.dto.ShortDataResponse;
import com.perli.base.entity.TrailerDetail;

public interface TrailerService {
	
	DataResponse getAll(DataRequest dataRequest);
	DataResponse getBy(DataRequest dataRequest);
	DataDto get(Integer idTrailer);
	ShortDataResponse delete(DeleteDto deleteDto);
	ShortDataResponse upsert(TrailerDetail trailerDetail);

}