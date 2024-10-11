/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09.Agre_ejm10;

import java.util.List;

/**
 *
 * @author NEISER
 */
public class Ciudad {
    private List <Habitante> habitantes;

    public Ciudad(List<Habitante> habitantes) {
        this.habitantes = habitantes;
    }

    public List <Habitante> getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(List <Habitante> habitantes) {
        this.habitantes = habitantes;
    }
}
