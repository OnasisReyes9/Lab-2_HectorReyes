/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_hector_reyes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
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
    static Random ran = new Random();

    public static void main(String[] args) {

        boolean continuear = true;
        boolean logIn = false;
        String usuario = "";
        String contraseña = "";
        int opcion = 0;
        ArrayList empleado = new ArrayList();
        String genero = "";
        String cargo = "";
        int contGerentes = 0;
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
                System.out.println("");
                if (opcion != 3) {
                    System.out.println("Debe ingresar mediante la opción 3");
                    System.out.println("");
                } else {
                    System.out.print("Ingrese Usuario: ");
                    usuario = leer.next();
                    System.out.print("Ingrese contraseña: ");
                    contraseña = leer.next();
                    if ("leobanegas".equals(usuario) && "99".equals(contraseña)) {
                        logIn = true;
                        System.out.println("");
                        System.out.println("Has ingresado exitosamente!");
                    } else {
                        System.out.println("Usuario o contraseña incorrecto");
                    }
                }//fin else*/
            }//fin while login
            System.out.println("");
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
            System.out.println("");
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
                    System.out.print("Seleccione el Cargo:\n"
                            + "1. Gerente\n"
                            + "2. Aseador\n"
                            + "3. Cajero\n"
                            + "4. Seguridad\n"
                            + "-> Ingrese opcion: ");
                    int opCargo = leer.nextInt();
                    while (opCargo < 1 && opCargo > 4
                            || contGerentes == 3) {
                        if (contGerentes == 3) {
                            System.out.println("Límite de Gerentes Alcanzado");
                        }
                        System.out.print("Seleccione un cargo válido:\n"
                                + "1. Gerente\n"
                                + "2. Aseador\n"
                                + "3. Cajero\n"
                                + "4. Seguridad\n"
                                + "-> Ingrese opcion: ");
                        opCargo = leer.nextInt();
                    }
                    switch (opCargo) {
                        case 1:
                            cargo = "Gerente";
                            contGerentes++;
                            break;
                        case 2:
                            cargo = "Aseador";
                            break;
                        case 3:
                            cargo = "Cajero";
                            break;
                        case 4:
                            cargo = "Seguridad";
                            break;
                    }//fin switch
                    empleado.add(new Empleados(nombre, apellido, color, edad, genero, altura, peso, titulo, cargo));
                    System.out.println("Se a agregado un empleado.");
                    break;
                case 2:
                    if (empleado.size() == 0) {
                        System.out.println("No hay empleados para despedir");
                    } else {
                        System.out.println("");
                        for (Object o : empleado) {
                            System.out.println(empleado.indexOf(o) + ". " + o);
                        }
                        System.out.println("");
                        System.out.print("Ingrese posición del empleado a despedir: ");
                        int despedir = leer.nextInt();
                        while (despedir < 0 && despedir > empleado.size() - 1) {
                            System.out.println("Ingrese una posicion válida");
                            System.out.print("Ingrese posición del empleado a despedir: ");
                            despedir = leer.nextInt();
                        }
                        if (((Empleados) empleado.get(despedir)).getCargo().equals("Gerente")) {
                            contGerentes--;
                        }
                        empleado.remove(despedir);
                        System.out.println("");
                        System.out.println("Se ha despedido un empleado.");
                    }
                    break;
                case 3:
                    System.out.println("Ya has ingresado.");
                    break;
                case 4:
                    if (contGerentes < 3) {
                        if (empleado.size() == 0) {
                            System.out.println("No hay empleados para ascender");
                        } else {
                            System.out.println("");
                            for (Object o : empleado) {
                                System.out.println(empleado.indexOf(o) + ". " + o);
                            }
                            System.out.print("Ingrese posicion del cajero a ascender: ");
                            int ascender = leer.nextInt();
                            while (ascender < 0 && ascender > empleado.size() - 1) {
                                System.out.println("Ingrese una posicion válida");
                                System.out.print("Ingrese posición del empleado a despedir: ");
                                ascender = leer.nextInt();
                            }
                            if (((Empleados) empleado.get(ascender)).getCargo().equals("Cajero")) {
                                ((Empleados) empleado.get(ascender)).setCargo("Gerente");
                                contGerentes++;
                            } else {
                                System.out.println("Solo puede ascender cajeros.");
                            }
                        }
                    } else {
                        System.out.println("Límite de Gerentes Alcanzado");
                    }
                    break;
                case 5:
                    if (empleado.size() == 0) {
                        System.out.println("No hay empleados para mostrar");
                    } else {
                        int cont = 0;
                        for (int i = 0; i < empleado.size(); i++) {
                            if (((Empleados) empleado.get(i)).getCargo().equals("Gerente")) {
                                if (cont == 0) {
                                    System.out.println("Gerente");
                                    cont++;
                                }
                                System.out.println(empleado.indexOf(empleado.get(i)) + ". " + empleado.get(i) + "\n");
                            }
                        }
                        cont = 0;
                        for (int i = 0; i < empleado.size(); i++) {
                            if (((Empleados) empleado.get(i)).getCargo().equals("Aseador")) {
                                if (cont == 0) {
                                    System.out.println("Aseador");
                                    cont++;
                                }
                                System.out.println(empleado.indexOf(empleado.get(i)) + ". " + empleado.get(i) + "\n");
                            }
                        }
                        cont = 0;
                        for (int i = 0; i < empleado.size(); i++) {
                            if (((Empleados) empleado.get(i)).getCargo().equals("Seguridad")) {
                                if (cont == 0) {
                                    System.out.println("Seguridad");
                                    cont++;
                                }
                                System.out.println(empleado.indexOf(empleado.get(i)) + ". " + empleado.get(i) + "\n");
                            }
                        }
                        cont = 0;
                        for (int i = 0; i < empleado.size(); i++) {
                            if (((Empleados) empleado.get(i)).getCargo().equals("Cajero")) {
                                if (cont == 0) {
                                    System.out.println("Cajero");
                                    cont++;
                                }
                                System.out.println(empleado.indexOf(empleado.get(i)) + ". " + empleado.get(i) + "\n");
                            }
                        }
                    }
                    break;
                case 6:
                    if (empleado.size() == 0) {
                        System.out.println("No hay empleados para modificar");
                    } else {
                        for (Object o : empleado) {
                            System.out.println(empleado.indexOf(o) + ". " + o);
                        }
                        System.out.println("");
                        System.out.print("Ingrese posición del empleado a modificar: ");
                        int pos = leer.nextInt();
                        System.out.print("1. Nombre\n"
                                + "2. Apellido\n"
                                + "3. Color Favorito\n"
                                + "4. Edad\n"
                                + "5. Género"
                                + "6. Altura\n"
                                + "7. Peso\n"
                                + "8. Título\n"
                                + "9. Cargo\n"
                                + "Ingrese que desea modificar: ");
                        int modificar = leer.nextInt();
                        switch (modificar) {
                            case 1:
                                System.out.print("Ingrese Nombre: ");
                                nombre = leer.next();
                                ((Empleados) empleado.get(pos)).setNombre(nombre);
                                break;
                            case 2:
                                System.out.print("Ingrese Apellido: ");
                                apellido = leer.next();
                                ((Empleados) empleado.get(pos)).setApellido(apellido);
                                break;
                            case 3:
                                System.out.print("Color favorito: ");
                                color = leer.next();
                                ((Empleados) empleado.get(pos)).setColFav(color);
                                break;
                            case 4:
                                System.out.print("Ingrese edad: ");
                                edad = leer.nextInt();
                                while (edad < 1) {
                                    System.out.print("Porfavor ingrese una edad válida: ");
                                    edad = leer.nextInt();
                                }
                                ((Empleados) empleado.get(pos)).setEdad(edad);
                                break;
                            case 5:
                                System.out.print("Ingrese 1 para indicar que es hombre o "
                                        + " ingrese 2 para indicar que es mujer: ");
                                gen = leer.nextInt();
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
                                ((Empleados) empleado.get(pos)).setGenero(genero);
                                break;
                            case 6:
                                System.out.print("Ingrese altura: ");
                                altura = leer.nextDouble();
                                while (altura < 1) {
                                    System.out.println("Porfavor ingrese una altura válida: ");
                                    altura = leer.nextDouble();
                                }
                                ((Empleados) empleado.get(pos)).setAltura(altura);
                                break;
                            case 7:
                                System.out.print("Ingrese peso: ");
                                peso = leer.nextDouble();
                                while (peso < 1) {
                                    System.out.println("Porfavor ingrese un peso válido: ");
                                    peso = leer.nextDouble();
                                }
                                ((Empleados) empleado.get(pos)).setPeso(peso);
                                break;
                            case 8:
                                System.out.print("Ingrese Título: ");
                                titulo = leer.next();
                                ((Empleados) empleado.get(pos)).setTitulo(titulo);
                                break;
                            case 9:
                                System.out.print("Seleccione el Cargo nuevo:\n "
                                        + "1. Gerente\n"
                                        + "2. Aseador\n"
                                        + "3. Cajero\n"
                                        + "4. Seguridad\n"
                                        + "-> Ingrese opcion: ");
                                opCargo = leer.nextInt();
                                while (opCargo < 1 && opCargo > 4) {
                                    System.out.print("Seleccione un cargo válido\n: "
                                            + "1. Gerente\n"
                                            + "2. Aseador\n"
                                            + "3. Cajero\n"
                                            + "4. Seguridad\n"
                                            + "-> Ingrese opcion: ");
                                    opCargo = leer.nextInt();
                                }
                                switch (opCargo) {
                                    case 1:
                                        cargo = "Gerente";
                                        contGerentes++;
                                        break;
                                    case 2:
                                        cargo = "Aseador";
                                        break;
                                    case 3:
                                        cargo = "Cajero";
                                        break;
                                    case 4:
                                        cargo = "Seguridad";
                                        break;
                                }//fin switch
                                ((Empleados) empleado.get(pos)).setCargo(cargo);
                                System.out.println("Se ha modificado el cargo de un empleado");
                            default:
                                System.out.println("Opcion no válida");
                        }
                    }
                    break;
                case 7:
                    String acum = "";
                    int posRandom = 0;
                    int cargoRandom = 0;
                    if (empleado.size() == 0) {
                        System.out.println("No hay empleados");
                    } else {
                        System.out.print("Ingrese cantidad de empleados a cambiar cargo: ");
                        int cant = leer.nextInt();
                        while (cant < 1 || cant > empleado.size()) {
                            System.out.println("Ingrese cantidad válida");
                            System.out.println("Ingrese cantidad de empleados a cambiar cargo: ");
                            cant = leer.nextInt();
                        }
                        if (cant < empleado.size()) {
                            System.out.println("No hay tal cantidad de empleados");
                        } else {
                            boolean revision = false;
                            while (cant > 0) {
                                posRandom = 0 + ran.nextInt(empleado.size());
                                while (acum.contains(posRandom + "")) {
                                    posRandom = 0 + ran.nextInt(empleado.size());
                                }
                                acum = posRandom + "";
                                cargoRandom = 1 + ran.nextInt(4);
                                while (revision == false) {
                                    cargoRandom = 1 + ran.nextInt(4);
                                    if (((Empleados) empleado.get(posRandom)).getCargo() == "Gerente"
                                            && cargoRandom == 1) {
                                    } else if (((Empleados) empleado.get(posRandom)).getCargo() == "Aseador"
                                            && cargoRandom == 2) {
                                    } else if (((Empleados) empleado.get(posRandom)).getCargo() == "Seguridad"
                                            && cargoRandom == 3) {
                                    } else if (((Empleados) empleado.get(posRandom)).getCargo() == "Cajero"
                                            && cargoRandom == 4) {
                                    } else {
                                        revision = true;
                                    }
                                }//fin while
                                switch (cargoRandom) {
                                    case 1:
                                        ((Empleados) empleado.get(posRandom)).setCargo("Gerente");
                                        break;
                                    case 2:
                                        ((Empleados) empleado.get(posRandom)).setCargo("Aseador");
                                        break;
                                    case 3:
                                        ((Empleados) empleado.get(posRandom)).setCargo("Seguridad");
                                        break;
                                    case 4:
                                        ((Empleados) empleado.get(posRandom)).setCargo("Cajero");
                                        break;
                                }
                                cant--;
                            }//fin while
                        }//fin else
                    }
                    break;
                default:
                    System.out.println("La opcion no existe.");
            }
            //System.out.println("");
        }//fin while menú

    }

}
