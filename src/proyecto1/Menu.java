/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author Caleb
 */
public class Menu {

    int opcion, opcion2, opcion3 = 0;

    Scanner obj = new Scanner(System.in);

    Pacientes pacientes = new Pacientes();

    Medicamentos medicamentos = new Medicamentos();

    public void mostrarMenu() {
        do {
            System.out.println("*******Bienvenido al sistema de la clinica*************");
            System.out.println("1. Pacientes "
                    + "\n2. Medicamentos "
                    + "\n3. Salir");
            System.out.println("Digite la opción: ");
            int opcion = obj.nextInt();

            switch (opcion) {
                case 1:
                    submenuPacientes();
                    break;
                case 2:
                    submenuMedicamentos();
                    break;
                case 3:
                    System.out.println("Cerrando el sistema");
                    System.exit(0);
                    break;
            }
        } while (opcion != 3);
    }

    public void submenuPacientes() {
        do {
            System.out.println("*******Pacientes********"
                    + "\n1. Agregar pacientes "
                    + "\n2. Consultar pacientes "
                    + "\n3. Borrar pacientes "
                    + "\n4. Atrás");
            System.out.println("Digite la opción: ");
            int opcion2 = obj.nextInt();
            switch (opcion2) {
                case 1:
                    pacientes.agregarPacientes();
                    break;
                case 2:
                    pacientes.consultarPacientes();
                    break;
                case 3:
                    pacientes.borrarPacientes();
                    break;
                case 4:
                    mostrarMenu();
                    break;
            }
        } while (opcion2 != 4);
    }

    public void submenuMedicamentos() {
        do {
            System.out.println("*******Medicamentos********"
                    + "\n1. Agregar medicamentos "
                    + "\n2. Consultar medicamentos "
                    + "\n3. Borrar medicamentos "
                    + "\n4. Atrás");
            System.out.println("Digite la opción: ");
            int opcion3 = obj.nextInt();
            switch (opcion3) {
                case 1:
                    medicamentos.agregarMedicamentos();
                    break;
                case 2:
                    medicamentos.consultarMedicamentos();
                    break;
                case 3:
                    medicamentos.borrarMedicamentos();
                    break;
                case 4:
                    mostrarMenu();
                    break;

            }
        } while (opcion3 != 4);
    }
}
