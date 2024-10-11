/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09.Agre_ejm02;

import java.util.List;

/**
 *
 * @author NEISER
 */
public class Escuela {
    private List<Alumno> alumnos;

    public Escuela(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
