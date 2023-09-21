package com.csti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csti.model.Catalogo;
import com.csti.repositories.CatalogoRepository;

@Service
public class DBService {
	
	@Autowired
	private CatalogoRepository catalogoRepository;
	
	public void instanciaBase() {
		Catalogo cat = new Catalogo(null, "DIGES", "SEDE 3", "1º Andar", 103);
		
		this.catalogoRepository.save(cat);
	}

}
