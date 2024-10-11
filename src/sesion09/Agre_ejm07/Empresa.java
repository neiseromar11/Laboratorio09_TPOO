/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion09.Agre_ejm07;

import java.util.List;

/**
 *
 * @author NEISER
 */
public class Empresa {
    private List <Cliente> clientes;

    public List <Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List <Cliente> clientes) {
        this.clientes = clientes;
    }

    public Empresa(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
