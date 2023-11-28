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
@Table(name = "remolques")
public class TrailersList implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idremolques", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idTrailer;
	
	@Column(name = "tiporemolque")
	private Boolean tipeTrailer;
	
	@Column(name = "tipoduenio")
	private Boolean ownerType;
	
	@Column(name = "placas")
	private String licensePlate;
	
	@Column(name = "modelo")
	private String model;
	
	@Column(name = "numeroserie")
	private String serialNumber;
	
	@Column(name = "observaciones")
	private String observations;
	
	@Column(name = "motivoborrado")
	private String deleteReason;
	
	@Column(name = "tarjetacirculacion")
	private String circulationCard;
	
	@Column(name = "numeroremolque")
	private Integer trailerNumber;
	
	@Column(name = "idestatusproceso")
	private Integer idStatusProcess;

}