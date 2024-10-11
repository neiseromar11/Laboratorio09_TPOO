/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09.Agre_ejm04;

import java.util.List;

/**
 *
 * @author NEISER
 */
public class Orquesta {
    private List <Musico> musicos;

    public Orquesta(List<Musico> musicos) {
        this.musicos = musicos;
    }

    public List <Musico> getMusicos() {
        return musicos;
    }

    public void setMusicos(List <Musico> musicos) {
        this.musicos = musicos;
    }
}
