package com.fastfive.defesacivil.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Avaliador {

	  @Id 
	  @GeneratedValue 
	  Long id;

	  @Column
	  String avaliador;
	  
	public Avaliador() {
	}
	  
	public Avaliador(String avaliador) {
		this.avaliador = avaliador;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAvaliador() {
		return avaliador;
	}

	public void setAvaliador(String avaliador) {
		this.avaliador = avaliador;
	}

}
