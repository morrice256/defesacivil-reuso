package com.fastfive.defesacivil.core.business;

import java.util.List;

import com.fastfive.defesacivil.core.model.Avaliador;

public interface IAvaliadorBusiness {
	List<Avaliador> findAll();

	Avaliador save(Avaliador avaliador);

}
