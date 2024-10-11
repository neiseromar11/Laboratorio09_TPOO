/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09.Agre_ejm06;

import java.util.List;

/**
 *
 * @author NEISER
 */
public class Auto {

    public Auto(List<Conductores> conductores) {
        this.conductores = conductores;
    }
    private List <Conductores> conductores;

    public List <Conductores> getConductores() {
        return conductores;
    }

    public void setConductores(List <Conductores> conductores) {
        this.conductores = conductores;
    }
    
}
