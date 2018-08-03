package com.fastfive.defesacivil.core.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.IRiscoBusiness;
import com.fastfive.defesacivil.core.model.Risco;
import com.fastfive.defesacivil.core.repository.RiscoRepository;

@Service
public class RiscoBusiness implements IRiscoBusiness {

	@Autowired
	private RiscoRepository riscoRepository;
	
	@Override
	public List<Risco> findAll() {
		return (List<Risco>) riscoRepository.findAll();
	}

	@Override
	public Risco save(Risco risco) {
		return riscoRepository.save(risco);
	}
 
	
}
