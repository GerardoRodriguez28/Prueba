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
@Table(name = "estatusproceso")
public class StatusProcess implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idestatusproceso", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idStatusProcess;
	
	@Column(name = "estatusproceso")
	private String statusProcess;
	
}

