package com.fastfive.defesacivil.core.business;

import java.util.List;

import com.fastfive.defesacivil.core.model.Chamado;

public interface IChamadoBusiness{

	List<Chamado> findAll();

	Chamado save(Chamado chamado);

}
