package mx.gob.queretaro.request;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CityRequest implements Serializable {

	private static final long serialVersionUID = -7369519744613007256L;
	@NotNull
	@NotEmpty(message ="El nombre de la ciudad no debe ser vacía")
	private String city;
	@NotNull
	private Long countryId;

	public CityRequest() {

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}



}
