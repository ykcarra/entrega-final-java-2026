
package com.ejemplo.articulos.service;

import com.ejemplo.articulos.model.Articulo;
import com.ejemplo.articulos.repository.ArticuloRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ArticuloServiceImpl implements ArticuloService {

    private final ArticuloRepository articuloRepository;

    
    public ArticuloServiceImpl(ArticuloRepository articuloRepository) {
        this.articuloRepository = articuloRepository;
    }
     
    @Override
    public List<Articulo> listarArticulos() {
        return articuloRepository.findAll();
    }

    @Override
    public Optional<Articulo> obtenerArticuloPorId(Long id) {
        Objects.requireNonNull(id,"El ID no puede ser nulo");
        return articuloRepository.findById(id);
    }

    @Override
    public Articulo guardarArticulo(Articulo articulo) {
        Objects.requireNonNull(articulo,"No puede ser un articulo nulo");
        return articuloRepository.save(articulo);
    }
    @Override
    public Articulo actualizarArticulo(Long id, Articulo articulo) {
        articulo.setId(id);
        return articuloRepository.save(articulo);
    }
    @Override
    public void eliminarArticulo(Long id) {
        Objects.requireNonNull(id,"El ID no puede ser nulo");
        articuloRepository.deleteById(id);
    }
}
