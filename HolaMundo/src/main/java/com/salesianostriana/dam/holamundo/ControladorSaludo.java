package com.salesianostriana.dam.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
		model.addAttribute("persona", new Persona("Ángel", "Naranjo González"));

		return "SaludoPersonalizado";
	}
}