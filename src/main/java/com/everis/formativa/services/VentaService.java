package com.everis.formativa.services;

import org.springframework.stereotype.Service;

import com.everis.formativa.repositories.VentaRepository;

@Service
public class VentaService {
	private final VentaRepository vr;
	
	public VentaService(VentaRepository ventaRepository) {
		this.vr = ventaRepository;
	}
}
