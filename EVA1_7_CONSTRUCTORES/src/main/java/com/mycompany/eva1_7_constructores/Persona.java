
package com.mycompany.eva1_7_constructores;

public class Persona {
    //ATRIBUTOS

    private String nombre;
    private String apellido;
    private int edad;
    
    //CONSTRUCTORES
    public Persona(){
           //inicializar 
           nombre= "----";
           apellido= "----";
           edad= -1;
           System.out.println(" LLAMADA AL CONSTRUCTOR DEFAULT");
    }
           //FIRMA
    public Persona( String nombre, String apellidos, int edad ){
        //iniicializar
        //this --> operador para acceder al contenido del objeto actual
        //permite visualizar todo lo que este definifo en la clase
        // sim importar que moficador tenga
        this.nombre=nombre;
        this.apellido=apellidos;
        this.edad=edad;
        
    }
    
    //METODOS O COMPORTMAIENTO 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre= valor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String valor) {
        apellido = valor;
        
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }
    
    public void imprimirDatos(){
        System.out.println(" DATOS PERSONALES ");
        System.out.println("Nombre:"+ nombre);
        System.out.println("Apellidos:" + apellido );
        System.out.println("Edad :"+ edad);
        
    }
    

}
