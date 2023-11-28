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
@Table(name = "polizasremolques")
public class TrailerPolicy implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idpolizasremolques", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idTrailerPolicy;
	
	@Column(name = "numeropoliza")
	private String policyNumber;
	
	@Column(name = "fechainicio")
	private String startDate;
	
	@Column(name = "fechavigencia")
	private String effectiveDate;
	
	@Column(name = "observaciones")
	private String observations;
	
	@Column(name = "remolqueanterior")
	private Integer previousTrailer;	
	
	@Column(name = "motivoborrado")
	private String deleteReason;
	
	@OneToOne
	@JoinColumn(name = "idestatusproceso")
	private StatusProcess statusProcess;
	
	@OneToOne
	@JoinColumn(name = "idaseguradoras")
	private Insurers insurers;
	
}

