package com.tarea4.categoria.servicio;

import com.tarea4.categoria.repositorio.RepositorioCategoria;
import com.tarea4.categoria.entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioCategoria {
    @Autowired
    private RepositorioCategoria categoriarepositorio;

    public Categoria registrarCategoria(Categoria categoria) throws Exception {
        Categoria c = null;
        c = categoria;
        if (c == null){
            throw new Exception("No se pudo registrar");
        }
        else {
            return categoriarepositorio.save(c);
        }
    }

    public List<Categoria> obtenerCategoria(){
        return categoriarepositorio.findAll();
    }
}