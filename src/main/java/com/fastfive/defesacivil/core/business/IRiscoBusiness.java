package com.fastfive.defesacivil.core.business;

import java.util.List;

import com.fastfive.defesacivil.core.model.Risco;

public interface IRiscoBusiness {
	List<Risco> findAll();

	Risco save(Risco risco);

}
