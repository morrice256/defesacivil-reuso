package com.fastfive.defesacivil.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class SolicitacaoVistoria {

	  @Id 
	  @GeneratedValue 
	  Long id;
	
	  @ManyToOne
	  @NotNull
	  Risco risco;
	  
	  @ManyToOne
	  @NotNull
	  Avaliador avaliador;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Risco getRisco() {
		return risco;
	}

	public void setRisco(Risco risco) {
		this.risco = risco;
	}

	public Avaliador getAvaliador() {
		return avaliador;
	}

	public void setAvaliador(Avaliador avaliador) {
		this.avaliador = avaliador;
	}

}
