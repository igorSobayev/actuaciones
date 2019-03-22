package com.dawes.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.model.ActuacionVO;
import com.dawes.repository.ActuacionRepository;

@Service
public class ActuacionServiceImpl implements ActuacionService {
	
	@Autowired
	ActuacionRepository ar;

	/* (non-Javadoc)
	 * @see com.dawes.service.ActuacionService#save(S)
	 */
	@Override
	public <S extends ActuacionVO> S save(S entity) {
		return ar.save(entity);
	}

	/* (non-Javadoc)
	 * @see com.dawes.service.ActuacionService#findById(java.lang.Integer)
	 */
	@Override
	public Optional<ActuacionVO> findById(Integer id) {
		return ar.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.dawes.service.ActuacionService#findAll()
	 */
	@Override
	public Iterable<ActuacionVO> findAll() {
		return ar.findAll();
	}
	
	/* (non-Javadoc)
	 * @see com.dawes.service.ActuacionService#findAll()
	 */
	@Override
	public List<Object[]> listado(LocalDate fecha1, LocalDate fecha2, int idEmpleado) {
		return ar.listado(fecha1, fecha2, idEmpleado);
	}
	
	

}
