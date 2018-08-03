package com.fastfive.defesacivil.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ProcessoLocalizacao {

	  @Id 
	  @GeneratedValue 
	  Integer id;
	  
	  @Column
	  String localizacao;

	public ProcessoLocalizacao() {
	}
	  
	public ProcessoLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	  
	  
}
