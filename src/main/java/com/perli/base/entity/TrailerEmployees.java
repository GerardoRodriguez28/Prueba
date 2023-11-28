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
@Table(name = "empleados_remolques")
public class TrailerEmployees implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idempleados_remolques", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idTrailerEmployees;
	
	@Column(name = "Idremolques")
	private Integer idTrailer;
	
	@Column(name = "tipomovto")
	private String movementType;
	
	@Column(name = "fechamovto")
	private String movementDate;
	
	@OneToOne
	@JoinColumn(name = "idempleados")
	private Employees employees;

}

