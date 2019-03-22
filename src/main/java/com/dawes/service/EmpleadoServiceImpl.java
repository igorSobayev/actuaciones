package com.dawes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.model.EmpleadoVO;
import com.dawes.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	EmpleadoRepository er;

	/* (non-Javadoc)
	 * @see com.dawes.service.EmpleadoService#save(S)
	 */
	@Override
	public <S extends EmpleadoVO> S save(S entity) {
		return er.save(entity);
	}

	/* (non-Javadoc)
	 * @see com.dawes.service.EmpleadoService#findById(java.lang.Integer)
	 */
	@Override
	public Optional<EmpleadoVO> findById(Integer id) {
		return er.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.dawes.service.EmpleadoService#findAll()
	 */
	@Override
	public Iterable<EmpleadoVO> findAll() {
		return er.findAll();
	}
	
	

}
