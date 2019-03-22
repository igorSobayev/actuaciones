package com.dawes.service;

import java.util.Optional;

import com.dawes.model.TipoActuacionVO;

public interface TipoActuacionService {

	<S extends TipoActuacionVO> S save(S entity);

	Optional<TipoActuacionVO> findById(Integer id);

	Iterable<TipoActuacionVO> findAll();

}