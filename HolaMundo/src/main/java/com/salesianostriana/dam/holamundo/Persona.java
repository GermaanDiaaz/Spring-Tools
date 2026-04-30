package com.salesianostriana.dam.holamundo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Persona {
	
	private String nombre;
	private String apellidos;
	private double notaMedia;
	private LocalDate fechaNaz;
	
}