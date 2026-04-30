package com.salesianostriana.dam.holamundo;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorSaludo {

	@GetMapping ("/saludo3")
	public String welcome3(Model model) {
		model.addAttribute("saludo", "Hola Mundo");
		model.addAttribute("mensaje", "Gatitas Sandungueras");
		model.addAttribute("url", "https://event.supercell.com/brawlstars/es");

		return "SaludoYEnlace";
	}
	
	@GetMapping ("/saludo2")
	public String welcome2(Model model) {
		model.addAttribute("persona", new Persona("Ángel", "Naranjo González", 7.3456, LocalDate.of(2005, 5, 26)));

		return "SaludoPersonalizado";
	}
	
	@GetMapping ({"/", "Welcome"})
	public String welcome(@RequestParam (name = "nombre", required = false, defaultValue = "Mundo") String nombre, Model model) {
		model.addAttribute("nombre", nombre);

		return "index";
	}
}