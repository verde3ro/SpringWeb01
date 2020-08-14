package mx.gob.queretaro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mx.gob.queretaro.exception.InternalException;
import mx.gob.queretaro.service.ICityService;
import mx.gob.queretaro.service.ICountryService;

@Controller
@RequestMapping("ciudad")
public class CityController {

	@Autowired
	private ICityService cityService;
	@Autowired
	private ICountryService countryService;

	@GetMapping("crear")
	public String create(ModelMap model) {
		try {
			model.addAttribute("countries", countryService.obtenerTodos());
		} catch (InternalException ex) {
			model.addAttribute("error", ex.getMessage());
		}

		return "ciudad/crear";
	}

	/*@PostMapping("guardar")
	public String guardar(ModelMap mode, @Valid @ModelAttribute("cityform") CityRequest cityRequest, BindingResult result) {

	}*/

}
