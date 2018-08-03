package com.fastfive.defesacivil.core.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.IBairroBusiness;
import com.fastfive.defesacivil.core.model.Bairro;
import com.fastfive.defesacivil.core.repository.BairroRepository;

@Service
public class BairroBusiness implements IBairroBusiness {

	@Autowired
	private BairroRepository bairroRepository;
	
	
	@Override
	public List<Bairro> findAll() {
		return (List<Bairro>) bairroRepository.findAll();
	}

}
