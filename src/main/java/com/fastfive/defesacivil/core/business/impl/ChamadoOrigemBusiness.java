package com.fastfive.defesacivil.core.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.IChamadoOrigemBusiness;
import com.fastfive.defesacivil.core.model.ChamadoOrigem;
import com.fastfive.defesacivil.core.repository.ChamadoOrigemRepository;

@Service
public class ChamadoOrigemBusiness implements IChamadoOrigemBusiness {

	@Autowired
	private ChamadoOrigemRepository chamadoOrigemRepository;
	
	@Override
	public List<ChamadoOrigem> findAll() {
		return (List<ChamadoOrigem>) chamadoOrigemRepository.findAll();
	}

	
}
