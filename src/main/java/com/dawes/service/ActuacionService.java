package com.dawes.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.dawes.model.ActuacionVO;

public interface ActuacionService {

	<S extends ActuacionVO> S save(S entity);

	Optional<ActuacionVO> findById(Integer id);

	Iterable<ActuacionVO> findAll();

	List<Object[]> listado(LocalDate fecha1, LocalDate fecha2, int idEmpleado);

}