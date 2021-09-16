package com.everis.formativa.services;

import org.springframework.stereotype.Service;

import com.everis.formativa.repositories.ProductoRepository;

@Service
public class ProductoService {
	private final ProductoRepository pr;
	
	public ProductoService(ProductoRepository productoRepository) {
		this.pr = productoRepository;
	}
}
