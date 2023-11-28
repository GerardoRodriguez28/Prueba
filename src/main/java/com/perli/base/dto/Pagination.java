package com.perli.base.dto;

import lombok.Data;

@Data
public class Pagination {
	
	private Integer actualPage;
	private Integer itemPerPage;
	private Integer total;
	private Integer pages;

}
