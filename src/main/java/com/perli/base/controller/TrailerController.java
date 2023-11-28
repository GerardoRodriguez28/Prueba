package com.perli.base.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.perli.base.constants.Constants;
import com.perli.base.dto.DataDto;
import com.perli.base.dto.DataRequest;
import com.perli.base.dto.DataResponse;
import com.perli.base.dto.DeleteDto;
import com.perli.base.dto.ShortDataResponse;
import com.perli.base.entity.TrailerDetail;
import com.perli.base.services.TrailerService;

@RestController
@RequestMapping(Constants.URL_VERCION_TRAILER)
public class TrailerController {
	
	@Autowired
	private TrailerService trailerService;
	
	@PostMapping(Constants.TRAILER_CONTROLLER_GETPOST)
	public ResponseEntity<DataResponse> get(@RequestBody DataRequest dataRequest) {
		
		if( dataRequest.getFilter().getField().toString().equals("") ) {
			return Optional.ofNullable(trailerService.getAll(dataRequest))
					.map(grupoResponse -> ResponseEntity.ok().body(grupoResponse))
					.orElseGet(() -> ResponseEntity.notFound().build());
			
		}else {
			return Optional.ofNullable(trailerService.getBy(dataRequest))
					.map(grupoResponse -> ResponseEntity.ok().body(grupoResponse))
					.orElseGet(() -> ResponseEntity.notFound().build());
		}
		
	}
	
	@GetMapping(Constants.TRAILER_CONTROLLER_GET)
	public ResponseEntity<DataDto> get(@PathVariable Integer idTrailer) {
		return Optional.ofNullable(trailerService.get(idTrailer))
				.map(grupoResponse -> ResponseEntity.ok().body(grupoResponse))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(Constants.TRAILER_CONTROLLER_DELETE)
	public ResponseEntity<ShortDataResponse> delete(@RequestBody DeleteDto deleteDto) {
		return Optional.ofNullable(trailerService.delete(deleteDto))
				.map(grupoResponse -> ResponseEntity.ok().body(grupoResponse))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PutMapping(Constants.TRAILER_CONTROLLER_UPSERT)
	public ResponseEntity<ShortDataResponse> upsert(@RequestBody TrailerDetail trailerDetail) {
		return Optional.ofNullable(trailerService.upsert(trailerDetail))
				.map(grupoResponse -> ResponseEntity.ok().body(grupoResponse))
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
}
