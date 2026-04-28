package com.salesianostriana.dam.ejemplo1;

import org.springframework.stereotype.Component;

@Component
public class Coche {

	private Motor motor;
	
	public Coche(Motor motor) {
		this.motor= motor;
	}
	
	public void arrancar() {
		
	}
}
