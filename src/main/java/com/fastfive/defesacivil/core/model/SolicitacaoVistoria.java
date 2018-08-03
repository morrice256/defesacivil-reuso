package com.fastfive.defesacivil.core.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue(value = "2")
public class SolicitacaoVistoria  extends Solicitacao {

	  @ManyToOne
	  @NotNull
	  Risco risco;
	  
	  @ManyToOne
	  @NotNull
	  Avaliador avaliador;

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
