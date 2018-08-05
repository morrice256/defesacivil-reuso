package com.fastfive.defesacivil.core.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fastfive.defesacivil.core.business.IEnderecoBusiness;
import com.fastfive.defesacivil.core.model.Endereco;
import com.fastfive.defesacivil.core.repository.EnderecoRepository;

@Service
public class EnderecoBusiness implements IEnderecoBusiness {
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Override
	public List<Endereco> findAll() {
		return (List<Endereco>) enderecoRepository.findAll();
	}

	@Override
	public Endereco save(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

}
