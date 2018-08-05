package com.fastfive.defesacivil.core.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.ISolicitacaoBusiness;
import com.fastfive.defesacivil.core.repository.SolicitacaoRepository;

@Service
public class SolicitacaoBusiness implements ISolicitacaoBusiness{

	@Autowired
	private SolicitacaoRepository solicitacaoRepository;
	

}
