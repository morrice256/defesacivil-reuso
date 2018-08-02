package com.fastfive.defesacivil.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class SolicitacaoLona {

	  @Id 
	  @GeneratedValue 
	  Long id;
	  
	  @NotNull
	  String descricao;
	  
	  @NotNull
	  Boolean colocada;	  
	  
	  @NotNull
	  String justificativa;
	  
	  @NotNull
	  Double metragem;
	  
	  @NotNull
	  Integer quantidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getColocada() {
		return colocada;
	}

	public void setColocada(Boolean colocada) {
		this.colocada = colocada;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public Double getMetragem() {
		return metragem;
	}

	public void setMetragem(Double metragem) {
		this.metragem = metragem;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
