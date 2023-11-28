package com.perli.base.dto;

import lombok.Data;

@Data
public class DataRequest {
	
	private Order order;
	private Filter filter;
	private Pagination pagination;

}