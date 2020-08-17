package mx.gob.queretaro.service;

import java.util.List;

import mx.gob.queretaro.bean.CityBean;
import mx.gob.queretaro.request.CityRequest;
import mx.gob.queretaro.exception.InternalException;

public interface ICityService {

	List<CityBean> obtenerTodos() throws InternalException;

	CityBean obtenerPorId(long id) throws InternalException;

	void guardar(CityRequest cityRequest) throws InternalException;

}
