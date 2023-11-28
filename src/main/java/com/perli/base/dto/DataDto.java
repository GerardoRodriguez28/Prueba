package com.perli.base.dto;

import java.util.List;
import com.perli.base.entity.TrailerDetail;
import com.perli.base.entity.TrailerEmployees;
import com.perli.base.entity.Units;

import lombok.Data;

@Data
public class DataDto {
	
	private TrailerDetail trailerDetail;	
	private List<Units> TrailersList;
	private List<TrailerEmployees> trailerEmployeesPut;
	private List<TrailerEmployees> trailerEmployeesPost;
	private List<TrailerEmployees> trailerEmployeesDelete;

}

