package com.fastfive.defesacivil.core.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Chamado {
	
	  @Id 
	  @GeneratedValue 
	  Long id;
	  
	  Long processo;
	  
	  @ManyToOne
	  @NotNull
	  ChamadoOrigem chamadoOrigem;
	  
	  @ManyToOne
	  @NotNull
	  ProcessoStatus processoStatus;

	  @ManyToOne
	  @NotNull
	  ProcessoLocalizacao processoLocalizacao;

		public Long getId() {
			return id;
		}
	
		public void setId(Long id) {
			this.id = id;
		}
	
		public Long getProcesso() {
			return processo;
		}
	
		public void setProcesso(Long processo) {
			this.processo = processo;
		}
	
		public ChamadoOrigem getChamadoOrigem() {
			return chamadoOrigem;
		}
	
		public void setChamadoOrigem(ChamadoOrigem chamadoOrigem) {
			this.chamadoOrigem = chamadoOrigem;
		}
	
		public ProcessoStatus getProcessoStatus() {
			return processoStatus;
		}
	
		public void setProcessoStatus(ProcessoStatus processoStatus) {
			this.processoStatus = processoStatus;
		}
	
		public ProcessoLocalizacao getProcessoLocalizacao() {
			return processoLocalizacao;
		}
	
		public void setProcessoLocalizacao(ProcessoLocalizacao processoLocalizacao) {
			this.processoLocalizacao = processoLocalizacao;
		}	  
}
