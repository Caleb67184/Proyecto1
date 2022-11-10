/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.LinkedList;

/**
 *
 * @author Caleb
 */
public class Paciente {
    
    String nombre;
    String medicamento;
    

    public Paciente(String nombre, String medicamento) {
        this.nombre = nombre;
        this.medicamento = medicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
    
    @Override
    public String toString() {
        return "Nombre:" + nombre;
    }
    
    
}
