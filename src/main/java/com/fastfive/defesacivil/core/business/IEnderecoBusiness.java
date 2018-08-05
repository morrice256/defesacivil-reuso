package com.fastfive.defesacivil.core.business;

import java.util.List;

import com.fastfive.defesacivil.core.model.Endereco;

public interface IEnderecoBusiness {

	List<Endereco> findAll();
	
	Endereco save(Endereco endereco);
	
}
