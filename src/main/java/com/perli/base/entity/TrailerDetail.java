package com.perli.base.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "remolquescaracteristicas")
public class TrailerDetail implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idremolquescaracteristicas", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idTrailerDetail;
	
	@Column(name = "clase")
	private String clase;
	
	@Column(name = "pesovehicular")
	private String vehicleWeight;
	
	@Column(name = "numeroejes")
	private Integer numberAxles;
	
	@Column(name = "numerollantas")
	private Integer numberTires;
	
	@Column(name = "capacidad")
	private String capacity;
	
	@Column(name = "dimensionremolque")
	private Double dimensionTrailer;
	
	@Column(name = "dimensiones")
	private String dimensions;
	
	@OneToOne
	@JoinColumn(name = "idremolques")
	private Trailers trailers;

}
