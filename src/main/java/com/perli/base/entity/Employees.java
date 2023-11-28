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
@Table(name = "empleados")
public class Employees implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idempleados", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idEmployees;
	
	@Column(name = "nombreempleado")
	private String Name;
	
	@Column(name = "apellidopaterno")
	private String motherLastName;
	
	@Column(name = "apellidomaterno")
	private String fatherLastName;

}
