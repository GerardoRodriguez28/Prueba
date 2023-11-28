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
@Table(name = "remolques")
public class Trailers implements Serializable {
	
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
	
	@OneToOne
	@JoinColumn(name = "idestatusproceso")
	private StatusProcess statusProcess;
	
	@OneToOne
	@JoinColumn(name = "idpolizasremolques")
	private TrailerPolicy trailerPolicy;
	
	@OneToOne
	@JoinColumn(name = "idmarcas")
	private Brands brands;

}

