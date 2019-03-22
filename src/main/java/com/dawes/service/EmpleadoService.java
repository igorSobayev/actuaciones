package com.dawes.service;

import java.util.Optional;

import com.dawes.model.EmpleadoVO;

public interface EmpleadoService {

	<S extends EmpleadoVO> S save(S entity);

	Optional<EmpleadoVO> findById(Integer id);

	Iterable<EmpleadoVO> findAll();

}