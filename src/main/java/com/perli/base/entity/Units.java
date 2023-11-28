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
@Table(name = "unidades")
public class Units implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "idunidades", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer idUnit;
	
	@Column(name = "numerounidad")
	private Integer unitNumber;	
	
	@Column(name = "idestatusproceso")
	private Integer idStatusProcess;
	
	@OneToOne
	@JoinColumn(name = "idremolques")
	private TrailersList trailersList;

}
