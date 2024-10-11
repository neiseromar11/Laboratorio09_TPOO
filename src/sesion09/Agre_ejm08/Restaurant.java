/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09.Agre_ejm08;

import java.util.List;

/**
 *
 * @author NEISER
 */
public class Restaurant {
    private List <Mesero> meseros;

    public Restaurant(List<Mesero> meseros) {
        this.meseros = meseros;
    }

    public List <Mesero> getMeseros() {
        return meseros;
    }

    public void setMeseros(List <Mesero> meseros) {
        this.meseros = meseros;
    }
}
