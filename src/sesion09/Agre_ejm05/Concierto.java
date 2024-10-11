/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09.Agre_ejm05;

import java.util.List;

/**
 *
 * @author NEISER
 */
public class Concierto {
    private List <Asistente> asistentes;

    public List <Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List <Asistente> asistentes) {
        this.asistentes = asistentes;
    }

    public Concierto(List<Asistente> asistentes) {
        this.asistentes = asistentes;
    }
    
}
