/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_hector_reyes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

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
        String genero = "";
        String cargo = "";
        while (continuear == true) {
            //while (logIn == false) {
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
                /*if (opcion != 3) {
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
                }//fin else*/
            //}//fin while login
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese Nombre: ");
                    String nombre = leer.next();
                    System.out.print("Ingrese Apellido: ");
                    String apellido = leer.next();
                    System.out.print("Color favorito: ");
                    String color = leer.next();
                    System.out.print("Ingrese edad: ");
                    int edad = leer.nextInt();
                    while (edad < 1) {
                        System.out.print("Porfavor ingrese una edad válida: ");
                        edad = leer.nextInt();
                    }
                    System.out.print("Ingrese 1 para indicar que es hombre o "
                            + " ingrese 2 para indicar que es mujer: ");
                    int gen = leer.nextInt();
                    while (gen < 1 && gen > 2) {
                        System.out.print("Ingrese 1 para indicar que es hombre o "
                                + " ingrese 2 para indicar que es mujer: ");
                        gen = leer.nextInt();
                    }
                    if (gen == 1) {
                        genero = "Masculino";
                    } else if (gen == 2) {
                        genero = "Femenino";
                    }
                    System.out.print("Ingrese altura: ");
                    double altura = leer.nextDouble();
                    while (altura < 1) {
                        System.out.println("Porfavor ingrese una altura válida: ");
                        altura = leer.nextDouble();
                    }
                    System.out.print("Ingrese peso: ");
                    double peso = leer.nextDouble();
                    while (peso < 1) {
                        System.out.println("Porfavor ingrese un peso válido: ");
                        peso = leer.nextDouble();
                    }
                    System.out.print("Ingrese Título: ");
                    String titulo = leer.next();
                    System.out.print("Seleccione el Cargo: "
                            + "1. Gerente\n"
                            + "2. Aseadores\n"
                            + "3. Cajeros\n"
                            + "4. Seguridad\n"+
                            "-> Ingrese opcion: ");
                    int opCargo = leer.nextInt();
                    while (opCargo < 1 && opCargo > 4) {
                        System.out.print("Seleccione un cargo válido\n: "
                                + "1. Gerente\n"
                                + "2. Aseadores\n"
                                + "3. Cajeros\n"
                                + "4. Seguridad\n"+
                                "-> Ingrese opcion: ");
                        opCargo = leer.nextInt();
                    }
                    switch (opCargo) {
                        case 1:
                            cargo = "Gerente";
                            break;
                        case 2:
                            cargo = "Aseadores";
                            break;
                        case 3:
                            cargo = "Cajeros";
                            break;
                        case 4:
                            cargo = "Seguridad";
                            break;
                    }
                    empleado.add(new Empleados(nombre, apellido, color, edad, genero, altura, peso, titulo, cargo));
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Ya has ingresado.");
                    break;
                case 4:
                    break;
                case 5:
                    String imprimir = "";
                    for (Object o : empleado) {
                        System.out.println(empleado.indexOf(o) + ". " + o);
                    }
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
