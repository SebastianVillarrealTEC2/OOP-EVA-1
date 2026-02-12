package com.mycompany.eva1_7_constructores;

/**
 *
 * @author bisonte
 */

public class EVA1_7_CONSTRUCTORES {

    public static void main(String[] args) {
        
                          //llamada al constructor de la clase
                          //constructor default
        Persona perso=new Persona();
        perso.imprimirDatos();
        
        Persona perso2= new Persona("Juan", "Perez jolote ", 30);
        perso2.imprimirDatos();
    }
}
