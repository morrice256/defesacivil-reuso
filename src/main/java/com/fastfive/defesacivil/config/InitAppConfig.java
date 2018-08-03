package com.fastfive.defesacivil.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.fastfive.defesacivil.core.model.Bairro;
import com.fastfive.defesacivil.core.model.ChamadoOrigem;
import com.fastfive.defesacivil.core.model.ProcessoLocalizacao;
import com.fastfive.defesacivil.core.model.ProcessoStatus;
import com.fastfive.defesacivil.core.model.RPA;
import com.fastfive.defesacivil.core.model.Regional;
import com.fastfive.defesacivil.core.repository.BairroRepository;
import com.fastfive.defesacivil.core.repository.ChamadoOrigemRepository;
import com.fastfive.defesacivil.core.repository.ProcessoLocalizacaoRepository;
import com.fastfive.defesacivil.core.repository.ProcessoStatusRepository;
import com.fastfive.defesacivil.core.repository.RPARepository;
import com.fastfive.defesacivil.core.repository.RegionalRepository;

@Component
public class InitAppConfig {

	@Autowired
	private ProcessoStatusRepository processoStatusRepository;
	
	@Autowired
	private ProcessoLocalizacaoRepository processoLocalizacaoRepository;
	
	@Autowired
	private ChamadoOrigemRepository chamadoOrigemRepository;
	
	@Autowired
	private RegionalRepository regionalRepository;
	
	@Autowired
	private BairroRepository bairroRepository;
	
	@Autowired
	private RPARepository rpaRepository;
		
	@EventListener(ContextRefreshedEvent.class)
	public void initDB() {
		initProcessoStatus();
		initProcessLocalizacao();
		initChamadoOrigem();
		initBairro();
		initRegional();
		initRPA();
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
	
	private void initBairro() {
		List<Bairro> list = new ArrayList<>();
		Bairro aflitos = new Bairro("Aflitos");
		Bairro afogados = new Bairro("Afogados");
		Bairro Ipsep = new Bairro("Ipsep");
		Bairro boaviagem = new Bairro("Boa Viagem");
		
		list.add(aflitos);
		list.add(afogados);
		list.add(Ipsep);
		list.add(boaviagem);
		
		bairroRepository.saveAll(list);		
	}
	
	private void initRegional() {
		List<Regional> list = new ArrayList<>();
		Regional planice = new Regional("PLANICIE");
		Regional gart = new Regional("GART");
		Regional norte = new Regional("NORTE");
		Regional nortedeste = new Regional("NOROESTE");
		Regional SUL = new Regional("SUL");
		Regional OESTE = new Regional("OESTE");
		
		list.add(planice);
		list.add(gart);
		list.add(norte);
		list.add(nortedeste);
		list.add(SUL);
		list.add(OESTE);
		
		regionalRepository.saveAll(list);
	}
	
	private void initRPA() {
		List<RPA> list = new ArrayList<>();
		RPA centro = new RPA(1, "CENTRO");
		RPA nordeste = new RPA(3, "NOROESTE");
		RPA sudoeste = new RPA(5, "SUDOESTE");
		RPA norte = new RPA(2, "NORTE");
		RPA SUL = new RPA(6, "SUL");
		
		list.add(centro);
		list.add(nordeste);
		list.add(sudoeste);
		list.add(norte);
		list.add(SUL);
		
		rpaRepository.saveAll(list);
	}
	
}
