package com.ciaf.colegio;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/estudiantes")  //todas las url de esta clase empiezan asi/
public class EstudienteController {
    // lista temporal para guardar estudiantes esto simula la base de datos
    private final List<Estudiante> estudiantes=new ArrayList<>();
    private long nextId=3; // se empieza a contar apartir de 3 para chocar con los anteriores

    public EstudienteController() {
    estudiantes.add(new Estudiante( 1l, "Armando Casa", "11b"));
    estudiantes.add(new Estudiante(2l, "Luisa Rendon", "9A") );
    }
    // METODO GET PARA OBTENER TODOS LOS ESTUDIENTES
    // URL get http losclhost:8080 api estudiantes
    @GetMapping
    public List<Estudiante> obtenerTodosLosEstudiantes(){
        return estudiantes; //ahora devuelve la lista con los estudiantes
    }
    //metodo Post: PARA AGREGAR UN NUEVO ESTUDIANTE
    //URL: POST htto: loscal host 8080 api studiante
    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante nuevoEstudiante){
        estudiantes.add(nuevoEstudiante);// agrga estudiante a la lista temporal

        return nuevoEstudiante; //devuelve el estudiante creado incluyendo su id
    }

}
