package com.csti.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csti.app.model.Catalogo;
import com.csti.app.repositories.CatalogoRepository;

@Service
public class CatalogoService {

	@Autowired
	private CatalogoRepository catalogoRepository;
	
	
	public Catalogo findById(Integer id) {
		Optional<Catalogo> obj = catalogoRepository.findById(id);
		return obj.get();
	}
	
	public List<Catalogo> findAll() {
		return catalogoRepository.findAll();
	}
	
	public List<Catalogo> findAllBySetor(String setor){
		return catalogoRepository.findAllBySetorIgnoreCaseContaining(setor);
	}
	
	

	public Catalogo create(Catalogo obj) {
		obj.setId(null);
		return catalogoRepository.save(obj);
	}

}
