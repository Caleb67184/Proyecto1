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
public class Medicamentos {

    
    int contador1, contador2, contador3 = 0;
    LinkedList<String> medicamentos = new LinkedList<>();

    //Constructor medicamentos
    public Medicamentos() {}
    
    Scanner obj = new Scanner(System.in);
    

    public void agregarMedicamentos() {
        System.out.println("Ingrese el medicamento: ");
        String medicamento = obj.nextLine();
        medicamentos.add(medicamento);
    }
    
    //Supuestamente devuelve true si el medicamento que el usuario escribio existe en la lista
    //pero por alguna razon siempre da false asi que lo quite
//    public boolean existeMedicamentos(String medi) {
//        String medicina = medi;
//        boolean existe = false;
//        if (medicamentos.contains(medicina) == true){
//             existe = true;
//        } else {
//            System.out.println("La medicina no existe");
//        }
//        return existe;
//    }

    public void consultarMedicamentos() {
        boolean vacia = medicamentos.isEmpty();
        if (vacia == true) {
            System.out.println("La lista está vacía, no se puede consultar nada");
        } else {
            System.out.println("Hay una cantidad de medicamentos de: \n" + cantidadMedicamentos());
            for (String medicinas : medicamentos) {
                System.out.println("Medicamento: " + medicinas);
            }
        }
    }

    public void borrarMedicamentos() {
        boolean vacia = medicamentos.isEmpty();
        if (vacia == true) {
            System.out.println("La lista está vacía, no se puede borrar nada");
        } else {
            System.out.println("Ingrese el medicamento a borrar: ");
            String medicamento = obj.nextLine();
            medicamentos.remove(medicamento);
        }
    }
    
    public int cantidadMedicamentos(){
    return medicamentos.size();
    }

   
    

}
