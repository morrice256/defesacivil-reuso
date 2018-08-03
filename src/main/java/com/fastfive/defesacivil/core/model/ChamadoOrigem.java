package com.fastfive.defesacivil.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ChamadoOrigem {

	  @Id 
	  @GeneratedValue 
	  Integer id;
	  
	  @Column
	  String origem;

	public ChamadoOrigem() {
	}
	  
	public ChamadoOrigem(String origem) {
		this.origem = origem;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	  
}
