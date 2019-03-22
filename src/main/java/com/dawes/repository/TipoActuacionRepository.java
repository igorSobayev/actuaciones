package com.dawes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dawes.model.TipoActuacionVO;

@Repository
public interface TipoActuacionRepository extends CrudRepository <TipoActuacionVO, Integer> {

}
