package com.bicript.bysafe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bicript.bysafe.dto.UsuarioDTO;
import com.bicript.bysafe.services.UsuarioServices;

import jakarta.validation.Valid;

@RequestMapping("usuario")
@RestController
public class UsuarioController {

	@Autowired
	UsuarioServices usuarioServices;
	
	
	@PostMapping(value = "/salvar")
	public ResponseEntity<UsuarioDTO> salvar(@Valid @RequestBody UsuarioDTO dto)
	{
		dto = usuarioServices.salvarUsuario(dto);
		return ResponseEntity.ok(dto);
	}
	
	@PostMapping(value = "/login")
	public ResponseEntity<?> login(@RequestBody UsuarioDTO dto){
		boolean login = usuarioServices.autenticarUsuario(dto);
		
		if (login) {		
			return ResponseEntity.ok("sucesso !!!");
		}
		else {
			return ResponseEntity.status(401).body("E-mail ou senha invalida");
		}
	}
	
	
	
	
	
}
