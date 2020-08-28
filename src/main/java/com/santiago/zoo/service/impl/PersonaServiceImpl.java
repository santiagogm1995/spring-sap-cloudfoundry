package com.santiago.zoo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.santiago.zoo.entity.Persona;
import com.santiago.zoo.entity.PersonaRepository;
import com.santiago.zoo.service.RestService;

@RestController
@RequestMapping(value = "/api")
public class PersonaServiceImpl implements RestService<Persona, String> {

	@Autowired
	private PersonaRepository personaRepo;

	@Override
	@GetMapping("/personas")
	public List<Persona> getAll() {
		return new ArrayList<>();
	}

	@Override
	@PostMapping("/personas")
	public List<Persona> deepEntity(@RequestBody List<Persona> personas) {
		try {
			personaRepo.saveAll(personas);
		} catch (Exception e) {
			//Ejemplo
		}

		return personas;

	}

	@Override
	@GetMapping("/persona{id}")
	public Persona getById(@RequestHeader String obj) {
		return new Persona("70069322Y");
	}

}
