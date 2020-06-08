package com.tarea4.categoria.servicioRest;

import com.tarea4.categoria.servicio.ServicioCategoria;
import com.tarea4.categoria.entidades.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class RestCategoria {
    @Autowired
    private ServicioCategoria servicioCategoria;

    @GetMapping("/obtener")
    public List<Categoria> obtenerCategoria(){
        return servicioCategoria.obtenerCategoria();
    }

    @PostMapping("/registrar")
    public Categoria registrarCategoria(@RequestBody Categoria categoria) throws Exception{
        return servicioCategoria.registrarCategoria(categoria);
    }
}