package com.perli.base.dto;

import com.perli.base.entity.Employees;

import lombok.Data;

@Data
public class TrailerEmployeesDto {	

	private Integer idTrailerEmployees;	
	private Integer IdTrailer;
	private String MovementType;
	private String MovementDate;
	private Employees employees;

}