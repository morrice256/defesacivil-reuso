package com.fastfive.defesacivil.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.fastfive.defesacivil.core.model.ChamadoOrigem;
import com.fastfive.defesacivil.core.model.ProcessoLocalizacao;
import com.fastfive.defesacivil.core.model.ProcessoStatus;
import com.fastfive.defesacivil.core.repository.ChamadoOrigemRepository;
import com.fastfive.defesacivil.core.repository.ProcessoLocalizacaoRepository;
import com.fastfive.defesacivil.core.repository.ProcessoStatusRepository;

@Component
public class InitAppConfig {

	@Autowired
	private ProcessoStatusRepository processoStatusRepository;
	
	@Autowired
	private ProcessoLocalizacaoRepository processoLocalizacaoRepository;
	
	@Autowired
	private ChamadoOrigemRepository chamadoOrigemRepository;
	
	@EventListener(ContextRefreshedEvent.class)
	public void initDB() {
		initProcessoStatus();
		initProcessLocalizacao();
		initChamadoOrigem();
	}
	
	private void initProcessoStatus() {
		List<ProcessoStatus> listProcessoStatus = new ArrayList<>();
		ProcessoStatus aberto = new ProcessoStatus("Aberto");
		ProcessoStatus concluido = new ProcessoStatus("Concluido");
		ProcessoStatus execucao = new ProcessoStatus("Execucao");
		ProcessoStatus cancelado = new ProcessoStatus("Cancelado");
		
		listProcessoStatus.add(aberto);
		listProcessoStatus.add(concluido);
		listProcessoStatus.add(execucao);
		listProcessoStatus.add(cancelado);

		processoStatusRepository.saveAll(listProcessoStatus);
	}
	
	private void initProcessLocalizacao() {
		List<ProcessoLocalizacao> listLocalizacao = new ArrayList<>();
		ProcessoLocalizacao SEDEC = new ProcessoLocalizacao("SEDEC - GERÊNCIA REGIONAL PLANICIE");
		ProcessoLocalizacao SEDEC1 = new ProcessoLocalizacao("SEDEC - GERÊNCIA REGIONAL NORTE - OPERACIONAL");
		ProcessoLocalizacao CODECIR1 = new ProcessoLocalizacao("CODECIR - GERÊNCIA REGIONAL PLANA");
		ProcessoLocalizacao CODECIR2 = new ProcessoLocalizacao("CODECIR - GERÊNCIA DE ANÁLISE DE RISCOS TECNOLÓGICOS");
		ProcessoLocalizacao ENGENHEIRO = new ProcessoLocalizacao("Engenheiro -  Morros");
		
		listLocalizacao.add(SEDEC);
		listLocalizacao.add(SEDEC1);
		listLocalizacao.add(CODECIR1);
		listLocalizacao.add(CODECIR2);
		listLocalizacao.add(ENGENHEIRO);
		
		processoLocalizacaoRepository.saveAll(listLocalizacao);
	}
	
	private void initChamadoOrigem() {
		List<ChamadoOrigem> list = new ArrayList<>();
		
		ChamadoOrigem ORIGEM = new ChamadoOrigem("Ocorrências");
		ChamadoOrigem ORIGEM1 = new ChamadoOrigem("Atividades Internas");
		ChamadoOrigem ORIGEM2 = new ChamadoOrigem("Não Encontrada");
		ChamadoOrigem ORIGEM3 = new ChamadoOrigem("Cidadão");
		
		list.add(ORIGEM);
		list.add(ORIGEM1);
		list.add(ORIGEM2);
		list.add(ORIGEM3);
		
		chamadoOrigemRepository.saveAll(list);
	}
	
}
