package com.fastfive.defesacivil.core.business.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.ISolicitacaoVistoriaBusiness;
import com.fastfive.defesacivil.core.model.SolicitacaoVistoria;
import com.fastfive.defesacivil.core.repository.SolicitacaoVistoriaRepository;

@Service
public class SolicitacaoVistoriaBusiness implements ISolicitacaoVistoriaBusiness{

	@Autowired
	private SolicitacaoVistoriaRepository solicitacaoVistoriaRepository;
	
	@Override
	public List<SolicitacaoVistoria> findAll() {
		return (List<SolicitacaoVistoria>) solicitacaoVistoriaRepository.findAll();
	}

	@Override
	public SolicitacaoVistoria save(SolicitacaoVistoria solicitacaoVistoria) {
		return solicitacaoVistoriaRepository.save(solicitacaoVistoria);
	}

	@Override
	public Optional<SolicitacaoVistoria> findById(Long id) {
		return solicitacaoVistoriaRepository.findById(id);
	}
}
