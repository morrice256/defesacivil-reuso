package com.fastfive.defesacivil.core.model;

import java.sql.Timestamp;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipoSolicitacao", discriminatorType = DiscriminatorType.INTEGER)
public class Solicitacao {

	  @Id 
	  @GeneratedValue 
	  private Long id;
	  
	  @ManyToOne
	  @NotNull
	  private Chamado chamado;
	
	  private Timestamp dataSolicitacao;
	  
	  @NotNull
	  private String descricao;
	  
	  @ManyToOne
	  @NotNull
	  private Regional regional;
	  
	  @NotNull
	  private String roteiro;
	  
	  @ManyToOne
	  @NotNull	  
	  private RPA rpa;

	  @NotNull
	  private String rpaMicroRegiao;
	  
	  @NotNull
	  private Boolean plantao;
	  
	  @NotNull
	  private Boolean vitimas;
	  	  
	  @NotNull
	  private Boolean vitimasFatais;
			
	  private Timestamp dataExecucao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Chamado getChamado() {
		return chamado;
	}

	public void setChamado(Chamado chamado) {
		this.chamado = chamado;
	}

	public Timestamp getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(Timestamp dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Regional getRegional() {
		return regional;
	}

	public void setRegional(Regional regional) {
		this.regional = regional;
	}

	public String getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}

	public RPA getRpa() {
		return rpa;
	}

	public void setRpa(RPA rpa) {
		this.rpa = rpa;
	}

	public String getRpaMicroRegiao() {
		return rpaMicroRegiao;
	}

	public void setRpaMicroRegiao(String rpaMicroRegiao) {
		this.rpaMicroRegiao = rpaMicroRegiao;
	}

	public Boolean getPlantao() {
		return plantao;
	}

	public void setPlantao(Boolean plantao) {
		this.plantao = plantao;
	}

	public Boolean getVitimas() {
		return vitimas;
	}

	public void setVitimas(Boolean vitimas) {
		this.vitimas = vitimas;
	}

	public Boolean getVitimasFatais() {
		return vitimasFatais;
	}

	public void setVitimasFatais(Boolean vitimasFatais) {
		this.vitimasFatais = vitimasFatais;
	}

	public Timestamp getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(Timestamp dataExecucao) {
		this.dataExecucao = dataExecucao;
	}
	  	  
}
