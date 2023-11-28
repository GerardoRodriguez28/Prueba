package com.perli.base.dto;

import com.perli.base.entity.Trailers;
import lombok.Data;

@Data
public class TrailerDetailDto {
	
	private Integer idTrailerDetail;	
	private String clase;
	private String vehicleWeight;
	private Integer numberAxles;
	private Integer numberTires;
	private String capacity;
	private Double dimensionTrailer;
	private String dimensions;
	private Trailers trailers;

}
