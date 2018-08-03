package com.fastfive.defesacivil.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class RPA {
	
	  @Id 
	  @GeneratedValue 
	  Long id;
	  
	  @NotNull
	  Integer cod;
	  
	  @NotNull
	  String nome;
	 
	  
	public RPA() {
	}

	public RPA(Integer cod, String nome) {
		this.cod = cod;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
