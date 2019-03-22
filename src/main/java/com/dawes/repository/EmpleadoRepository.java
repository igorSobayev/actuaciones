package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.model.EmpleadoVO;

@Repository
public interface EmpleadoRepository extends CrudRepository <EmpleadoVO, Integer> {

}
