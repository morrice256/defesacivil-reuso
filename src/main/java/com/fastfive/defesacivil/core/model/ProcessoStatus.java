package com.fastfive.defesacivil.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProcessoStatus {

	  @Id 
	  @GeneratedValue 
	  Integer id;
	  
	  @Column
	  String descricao;
	
}
