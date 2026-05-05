package com.salesianostriana.dam.h2prueba;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {

	private final ProductoRepository productoRepository;
	
	@PostConstruct
	public void run() {
		
		productoRepository.save(
				Producto.builder()
					.nombre("Bocata de manolo")
					.precio("2.25")
				.build()
				);
		
		productoRepository.findAll()
			.forEach(syso)
	}
}
