/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09.Agre_ejm01;

import java.util.List;

/**
 *
 * @author NEISER
 */
public class Universidad {
    private List <Profesor> profesores;

    public List <Profesor> getProfesores() {
        return profesores;
    }

    public Universidad(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void setProfesores(List <Profesor> profesores) {
        this.profesores = profesores;
    }
}
