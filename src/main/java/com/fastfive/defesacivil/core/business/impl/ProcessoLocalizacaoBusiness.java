package com.fastfive.defesacivil.core.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.IProcessoLocalizacaoBusiness;
import com.fastfive.defesacivil.core.model.ProcessoLocalizacao;
import com.fastfive.defesacivil.core.repository.ProcessoLocalizacaoRepository;

@Service
public class ProcessoLocalizacaoBusiness implements IProcessoLocalizacaoBusiness {

	@Autowired
	private ProcessoLocalizacaoRepository processoLocalizacaoRepository;
	
	@Override
	public List<ProcessoLocalizacao> findAll() {
		return (List<ProcessoLocalizacao>) processoLocalizacaoRepository.findAll();
	}

	
}
