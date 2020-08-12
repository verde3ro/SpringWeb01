package mx.gob.queretaro.service.impl;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.gob.queretaro.bean.CityBean;
import mx.gob.queretaro.exception.InternalException;
import mx.gob.queretaro.repository.ICityRepository;
import mx.gob.queretaro.service.ICityService;

@Service
public class CityServiceImpl implements ICityService {

	private final ICityRepository cityRepository;
	private final Logger log = Logger.getLogger(getClass().getName());

	@Autowired
	public CityServiceImpl (ICityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@Override
	public List<CityBean> obtenerTodos() throws InternalException {
		try {
			return cityRepository.obtenerTodos();
		} catch (InternalException ex) {
			throw ex;
		} catch (Exception ex) {
			log.error("Ocurrio un eror al obtener las ciudades", ex);
			throw new InternalException("Ocurrio un eror al obtener las ciudades");
		}
	}

}
