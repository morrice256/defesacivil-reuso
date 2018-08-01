package com.fastfive.defesacivil.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Chamado {
	
	  @Id 
	  @GeneratedValue 
	  Long id;
	  
	  @Column
	  Long processo;
	  
	  @ManyToOne
	  ChamadoOrigem chamadoOrigem;
	  
	  @ManyToOne
	  ProcessoStatus processoStatus;

	  @ManyToOne
	  ProcessoLocalizacao processoLocalizacao;
}
