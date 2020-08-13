package mx.gob.queretaro.repository;

import java.util.List;

import mx.gob.queretaro.bean.CountryBean;
import mx.gob.queretaro.exception.InternalException;

public interface ICountryRepository {

	List<CountryBean> obtenerTodos() throws InternalException;

}
