/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject2.eva1_4_encapsulamiento;

/**
 *
 * @author bisonte
 */
public class Persona {
//Atrubutos 

    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;

    //CONTRUCTORES 
    //comportamiento (METODOS) // intermediario --> interfaz
    // get ( devuelve ) y set (asigna)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String valor) {
        apellidos = valor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char valor) {
        genero = valor;
    }

    public void ImprimirDatos() {
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Apellidos:" + apellidos);
        System.out.println(" Edad:" + edad);
        System.out.println(" Genero:" + genero);

    }

    public String generarNombreCompleto() {
        return nombre + " " + apellidos;
    }

}
