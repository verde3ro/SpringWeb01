package mx.gob.queretaro.service;

import java.util.List;

import mx.gob.queretaro.bean.CountryBean;
import mx.gob.queretaro.exception.InternalException;

public interface ICountryService {

	List<CountryBean> obtenerTodos() throws InternalException;

}
