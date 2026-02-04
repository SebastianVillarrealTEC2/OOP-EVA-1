package com.mycompany.eva1_1clases;

public class EVA1_1CLASES {

    public static void main(String[] args) {
        //CREAR OBJETOS: --> INSTANCIAR
        //DECLARACION = INSTANCIACION
        //CLASE identificador = new CLASE(argumentos)
        //new --> crea el objeto en la memoria RAM
        Persona perso1 = new Persona();
        System.out.println(" ");
        System.out.println(perso1); // REFERENCIA ( DIRECCION DE MEMORIA)
        perso1.nombre = "Juan";
        perso1.apellidos = " Prez Jolote";
        perso1.Edad = 30;
        perso1.imprimir();
    }
}
//PERSONA --> plantilla de codigo: NO EXISTE
//TIPOS DE DATOS ABSTRACTOS

class Persona {

    //DATOS (ESTADO), variables --> ATRIBUTOS
    String nombre;
    String apellidos;
    int Edad;

    //COMPORTAMIENTO --> METODOS
    void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad " + Edad);

    }
}
