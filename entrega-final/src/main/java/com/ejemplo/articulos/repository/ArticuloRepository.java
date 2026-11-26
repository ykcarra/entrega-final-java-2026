package com.ejemplo.articulos.repository;

import com.ejemplo.articulos.model.Articulo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<Articulo, Long> {

}


