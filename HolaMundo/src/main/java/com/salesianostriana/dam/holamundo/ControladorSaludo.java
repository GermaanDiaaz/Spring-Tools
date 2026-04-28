package com.salesianostriana.dam.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorSaludo {

	@GetMapping ("/saludo3")
	public String welcome3(Model model) {
		model.addAttribute("saludo", "Hola Mundo");
		
		return "SaludoYEnlace";
	}
}
