package com.ciaf.colegio;
// esto se convertira en euna entidad para la base de datos
public class Estudiante {


    private  long id;
    private String nombre;
    private String curso;

    //construtor vavio para algunas libretias
    public Estudiante(long id, String nombre, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
    }
    // sigo con getters y setter para acceder a los datos

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso = curso;}



    


}
