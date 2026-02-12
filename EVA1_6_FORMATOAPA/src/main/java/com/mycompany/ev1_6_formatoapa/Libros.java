
package com.mycompany.ev1_6_formatoapa;
/**
 *
 * @author villa
 */
public class Libros {
    private String autor;
    private String titulo;
    private int year;
    private String ciudad; 
    private String editorial;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String valor) {
        autor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String valor) {
        titulo = valor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int valor) {
        year = valor;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String valor) {
        ciudad = valor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String valor) {
        editorial = valor;
    }
    
    public void imprimirDatos() {
    System.out.println(" DATOS DEL LIBRO");
    System.out.println("Autor: " + autor);
    System.out.println("Titulo: " + titulo);
    System.out.println("Año: " + year);
    System.out.println("Ciudad: " + ciudad);
    System.out.println("Editorial: " + editorial);
    System.out.println(" ");
}
    
    
}
