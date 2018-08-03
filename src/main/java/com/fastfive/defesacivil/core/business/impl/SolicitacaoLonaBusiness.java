package com.fastfive.defesacivil.core.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.ISolicitacaoLonaBusiness;
import com.fastfive.defesacivil.core.model.SolicitacaoLona;
import com.fastfive.defesacivil.core.repository.SolicitacaoLonaRepository;

@Service
public class SolicitacaoLonaBusiness implements ISolicitacaoLonaBusiness{

	@Autowired
	private SolicitacaoLonaRepository solicitacaoLonaRepository;
	
	@Override
	public List<SolicitacaoLona> findAll() {
		return (List<SolicitacaoLona>) solicitacaoLonaRepository.findAll();
	}

	@Override
	public SolicitacaoLona save(SolicitacaoLona solicitacaoLona) {
		return solicitacaoLonaRepository.save(solicitacaoLona);
	}
}
