package com.perli.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "aseguradoras")
public class Insurers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idaseguradoras")
	private Integer idInsurer;
	
	@Column(name = "nombreaseguradora")
	private String nameInsurer;
	
	@Column(name = "motivoborrado")
	private String deleteReason;
	
	@OneToOne
	@JoinColumn(name = "idestatusproceso")
	private StatusProcess statusProcess;

}
