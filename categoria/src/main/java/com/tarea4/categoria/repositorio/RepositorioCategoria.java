package com.tarea4.categoria.repositorio;

import com.tarea4.categoria.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoria  extends JpaRepository<Categoria, Long> {

}
