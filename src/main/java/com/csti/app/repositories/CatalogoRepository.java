package com.csti.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csti.app.model.Catalogo;

@Repository
public interface CatalogoRepository extends JpaRepository<Catalogo, Integer> {

}