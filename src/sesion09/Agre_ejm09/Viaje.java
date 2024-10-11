/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09.Agre_ejm09;

import java.util.List;

/**
 *
 * @author NEISER
 */
public class Viaje {
    private List <Turista> turistas;

    public Viaje(List<Turista> turistas) {
        this.turistas = turistas;
    }

    public List <Turista> getTuristas() {
        return turistas;
    }

    public void setTuristas(List <Turista> turistas) {
        this.turistas = turistas;
    }
}
