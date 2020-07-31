/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_hector_reyes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Onasis Reyes
 */
public class Lab2_Hector_Reyes {

    /**
     * @param args the command line arguments
     */
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        boolean continuear = true;
        boolean logIn = false;
        String usuario = "";
        String contraseña = "";
        int opcion = 0;
        ArrayList empleado = new ArrayList();
        
        while (continuear == true) {
            while (logIn == false) {
                System.out.print("---MENÚ---\n"
                        + "1. Registro de Empleados\n"
                        + "2. Despedir Empleados\n"
                        + "3. Log In\n"
                        + "4. Ascender Cajero\n"
                        + "5. Listar Empleados\n"
                        + "6. Modificar Empleado\n"
                        + "7. RANDOM\n"
                        + "-> Ingrese su opción: ");
                opcion = leer.nextInt();
                if (opcion != 3) {
                    System.out.println("Debe ingresar mediante la opción 3");
                } else {
                    System.out.print("Ingrese Usuario: ");
                    usuario = leer.next();
                    System.out.print("Ingrese contraseña: ");
                    contraseña = leer.next();
                    if ("leobanegas".equals(usuario) && "99".equals(contraseña)) {
                        logIn = true;
                        System.out.println("Has ingresado exitosamente!");
                    } else {
                        System.out.println("Usuario o contraseña incorrecto");
                    }
                }//fin else
            }//fin while login
            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Ya has ingresado.");
                    break;
                case 4:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("La opcion no existe.");
            }

        }//fin while menú

    }

}
