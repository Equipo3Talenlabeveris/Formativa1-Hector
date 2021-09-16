package com.everis.formativa.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.everis.formativa.models.Usuario;
import com.everis.formativa.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	private final UsuarioRepository ur;
	
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.ur = usuarioRepository;
	}

	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	public void crearUsuario(@Valid Usuario usuario) {
		// TODO Auto-generated method stub
		ur.save(usuario);
		
	}

	public Usuario buscarUsuario(Long id) {
		// TODO Auto-generated method stub
		Optional<Usuario> oUsuario = ur.findById(id);
		if(oUsuario.isPresent()) {
			return oUsuario.get();
		}
		return null;
	}
}
