/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2_hector_reyes;

import java.awt.Color;

/**
 *
 * @author Onasis Reyes
 */
public class Empleados {

    private String nombre;
    private String apellido;
    private String colFav;
    private int edad;
    private String genero;
    private double altura;
    private double peso;
    private String titulo;
    private String cargo;

    public Empleados() {
    }
    
    public Empleados(String nombre, String apellido, String colFav, int edad, String genero, double altura, double peso, String titulo, String cargo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.colFav = colFav;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.titulo = titulo;
        this.cargo = cargo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColFav() {
        return colFav;
    }

    public void setColFav(String colFav) {
        this.colFav = colFav;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre
                + "\napellido: " + apellido
                + "\ncolFav: " + colFav
                + "\nedad: " + edad
                + "\ngenero: " + genero
                + "\naltura: " + altura
                + "\npeso: " + peso
                + "\ntitulo: " + titulo
                + "\ncargo: " + cargo;
    }

}
