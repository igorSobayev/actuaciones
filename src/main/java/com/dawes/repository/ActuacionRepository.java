package com.dawes.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dawes.model.ActuacionVO;

@Repository
public interface ActuacionRepository extends CrudRepository <ActuacionVO, Integer> {
	
	@Query("select a, sum(a.km + a.dietas + a.visado + a.repro) from ActuacionVO a join fetch a.empleado e join fetch a.tipoActuacion ta "
			+ "where a.fecha between :fecha1 and :fecha2 and e.idEmpleado = :idEmpleado group by a.idActuaciones")
	List<Object[]> listado(@Param("fecha1") LocalDate fecha1, @Param("fecha2") LocalDate fecha2, @Param("idEmpleado") int idEmpleado);

}
