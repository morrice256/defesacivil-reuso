package com.fastfive.defesacivil.core.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fastfive.defesacivil.core.business.IAvaliadorBusiness;
import com.fastfive.defesacivil.core.model.Avaliador;
import com.fastfive.defesacivil.core.repository.AvaliadorRepository;

@Service
public class AvaliadorBusiness implements IAvaliadorBusiness {

	@Autowired
	private AvaliadorRepository avaliadorRepository;
	
	@Override
	public List<Avaliador> findAll() {
		return (List<Avaliador>) avaliadorRepository.findAll();
	}

	@Override
	public Avaliador save(Avaliador avaliador) {
		return avaliadorRepository.save(avaliador);
	}

}
