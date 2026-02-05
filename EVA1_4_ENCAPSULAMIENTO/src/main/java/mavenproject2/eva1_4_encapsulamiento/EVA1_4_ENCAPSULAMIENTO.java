/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package mavenproject2.eva1_4_encapsulamiento;

/**
 *
 * @author bisonte
 */
public class EVA1_4_ENCAPSULAMIENTO {

    public static void main(String[] args) {
        Persona persona = new Persona();
       
        persona.setNombre("Ruben");
        persona.setApellidos(" Hernandez ");
        persona.setEdad(44);
        persona.setGenero('H');
        
        persona.ImprimirDatos();
        System.out.println(" Nombre commpleto:" + persona.generarNombreCompleto());
        
    }
}
