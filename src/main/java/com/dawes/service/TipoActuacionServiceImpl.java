package com.dawes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dawes.model.TipoActuacionVO;
import com.dawes.repository.TipoActuacionRepository;

@Service
public class TipoActuacionServiceImpl implements TipoActuacionService {
	
	@Autowired
	TipoActuacionRepository tar;

	/* (non-Javadoc)
	 * @see com.dawes.service.TipoActuacionService#save(S)
	 */
	@Override
	public <S extends TipoActuacionVO> S save(S entity) {
		return tar.save(entity);
	}

	/* (non-Javadoc)
	 * @see com.dawes.service.TipoActuacionService#findById(java.lang.Integer)
	 */
	@Override
	public Optional<TipoActuacionVO> findById(Integer id) {
		return tar.findById(id);
	}

	/* (non-Javadoc)
	 * @see com.dawes.service.TipoActuacionService#findAll()
	 */
	@Override
	public Iterable<TipoActuacionVO> findAll() {
		return tar.findAll();
	}

}
