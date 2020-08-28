package com.santiago.zoo.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long>{
}