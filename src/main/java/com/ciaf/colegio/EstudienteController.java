package com.ciaf.colegio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/estudiantes")  //todas las url de esta clase empiezan asi/
public class EstudienteController { //este metodo se ejhecutara cuandom alguien haga una peticion GETA:
                                    // HTTP://LOCALHOST:8080/API/estudiantes

@GetMapping
public List<Estudiante>obtenerTodosLosEstudiantes(){

//por ahora se devuelves los datos de ejemple
// mas adelante esto vendra en la base de datos(postgreSQL)
return List.of(
   new Estudiante(1L, "Luisa Fernanda", "10A"),
   new Estudiante(2L, "Albeiro Torres", "11b")
);
}
}