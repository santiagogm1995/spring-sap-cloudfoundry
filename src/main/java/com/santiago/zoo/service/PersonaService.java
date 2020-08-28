package com.santiago.zoo.service;

import java.util.List;

import com.santiago.zoo.entity.Persona;

public interface PersonaService {

	public List<Persona> getPersonas();
	
	public List<Persona> deepPersonas(List<Persona> personas);
}
