package com.perli.base.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "marcas")
public class Brands implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idmarcas", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idBrand;
	
	@Column(name = "marca")
	private String Brand;
	
}
