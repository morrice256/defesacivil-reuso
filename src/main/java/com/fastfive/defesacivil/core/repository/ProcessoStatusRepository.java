package com.fastfive.defesacivil.core.repository;

import org.springframework.data.repository.CrudRepository;

import com.fastfive.defesacivil.core.model.ProcessoStatus;

public interface ProcessoStatusRepository extends CrudRepository<ProcessoStatus, Long>{

	ProcessoStatus findByDescricao(String chamadoStartStatus);

}
