package com.fastfive.defesacivil.core.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.IRegionalBusiness;
import com.fastfive.defesacivil.core.model.Regional;
import com.fastfive.defesacivil.core.repository.RegionalRepository;

@Service
public class RegionalBusiness implements IRegionalBusiness {

	@Autowired
	private RegionalRepository regionalRepository;
	
	
	@Override
	public List<Regional> findAll() {
		return (List<Regional>) regionalRepository.findAll();
	}

}
