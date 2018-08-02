package com.fastfive.defesacivil.core.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.IChamadoBusiness;
import com.fastfive.defesacivil.core.model.Chamado;
import com.fastfive.defesacivil.core.repository.ChamadoRepository;

@Service
public class ChamadoBusiness implements IChamadoBusiness {

	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@Override
	public List<Chamado> findAll() {
		return (List<Chamado>) chamadoRepository.findAll();
	}

	@Override
	public Chamado save(Chamado chamado) {
		chamado.setProcessoStatus(null);
		return chamadoRepository.save(chamado);
	}

	
	
}
