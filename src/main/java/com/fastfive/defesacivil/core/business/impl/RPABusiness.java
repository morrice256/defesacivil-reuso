package com.fastfive.defesacivil.core.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.IRPABusiness;
import com.fastfive.defesacivil.core.model.RPA;
import com.fastfive.defesacivil.core.repository.RPARepository;

@Service
public class RPABusiness implements IRPABusiness {

	@Autowired
	private RPARepository rpaRepository;
	
	
	@Override
	public List<RPA> findAll() {
		return (List<RPA>) rpaRepository.findAll();
	}

}
