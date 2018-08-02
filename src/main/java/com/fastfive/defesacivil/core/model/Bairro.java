package com.fastfive.defesacivil.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Bairro {
	
	  @Id 
	  @GeneratedValue 
	  Long id;
	  
	  @NotNull
	  String bairro;
	 
	public Bairro() {
	}
	  
	public Bairro(String bairro) {
		this.bairro = bairro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	
	
}
