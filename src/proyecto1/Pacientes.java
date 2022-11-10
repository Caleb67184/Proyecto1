/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;


import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author Caleb
 */
public class Pacientes {

   
    LinkedList<Paciente> pacientes = new LinkedList<>();
    Medicamentos medicamentos = new Medicamentos();
    //Constructor pacientes

    public Pacientes() {}
    
    
    Scanner obj = new Scanner(System.in);

    public void agregarPacientes() {
        System.out.println("Ingrese el nombre del paciente: ");
        String nombre = obj.nextLine();
        System.out.println("Ingrese el medicamento del paciente: ");
        String medicamento = obj.nextLine();
        Paciente paciente1 = new Paciente(nombre, medicamento);
        pacientes.add(paciente1);
         
    }

    public void consultarPacientes() {
        boolean vacia = pacientes.isEmpty();
        if (vacia == true) {
            System.out.println("La lista está vacía, no se puede consultar nada");
        } else {
            System.out.println("Hay una cantidad de "+cantidadPacientes()+" pacientes");
            for (int i = 0; i < pacientes.size(); i++) {
                System.out.println(pacientes.get(i).toString());
            }
        }
    }

    public void borrarPacientes() {
        boolean vacia = pacientes.isEmpty();
        if (vacia == true) {
            System.out.println("La lista está vacía, no se puede borrar nada");
        } else {
            System.out.println("Ingrese el paciente a borrar: ");
            String paciente = obj.nextLine();
            pacientes.remove(paciente);
        }
    }

    public int cantidadPacientes(){
    return pacientes.size();
    }
}
