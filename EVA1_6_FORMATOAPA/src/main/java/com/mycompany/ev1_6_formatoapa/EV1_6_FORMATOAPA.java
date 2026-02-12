
package com.mycompany.ev1_6_formatoapa;

/**
 *
 * @author villa
 */
public class EV1_6_FORMATOAPA {

    public static void main(String[] args) {

        Libros libro1 = new Libros();
        libro1.setAutor(" J. K. Rowling ");
        libro1.setTitulo("Harry Potter and the Sorcerer's Stone.");
        libro1.setYear(2020);
        libro1.setCiudad("Reino Unido");
        libro1.setEditorial(" Scholastic Inc. ");
        libro1.imprimirDatos();

        Libros libro2 = new Libros();
        libro2.setAutor("Miguel de Cervantes Saavedra");
        libro2.setTitulo(" El ingenioso hidalgo Don Quijote de la Mancha");
        libro2.setYear(1605);
        libro2.setCiudad("Madrid ");
        libro2.setEditorial("Juan de la Cuesta.");
        libro2.imprimirDatos();

        Libros libro3 = new Libros();
        libro3.setAutor("Antoine de Saint-Exupéry");
        libro3.setTitulo("El Principito");
        libro3.setYear(1943);
        libro3.setCiudad("Nueva York");
        libro3.setEditorial("Reynal & Hitchcock");
        libro3.imprimirDatos();

    }
}
