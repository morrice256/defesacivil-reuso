package com.fastfive.defesacivil.core.business;

import java.util.List;
import java.util.Optional;

import com.fastfive.defesacivil.core.model.Chamado;

public interface IChamadoBusiness{

	List<Chamado> findAll();

	Chamado save(Chamado chamado);

	Optional<Chamado> findById(Long id);

}
