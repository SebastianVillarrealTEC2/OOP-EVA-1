/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_8_productos;

/**
 *
 * @author bisonte
 */
public class Productos {
    
    private String nombre;
    private String marca;
    private String unidad; 
    private double precio;
    private double cantidad;
    
    //const defa
    public Productos() { 
        this.nombre = "----";
        this.marca = "----";
        this.unidad = "------";
        this.precio = 0.0;
        this.cantidad = 0.0;
    }

   //cons argumentos
    public Productos(String nombre, String marca, String unidad, double precio, double cantidad) {
        this.nombre = nombre;
        this.marca = marca;
        this.unidad = unidad;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        this.nombre = valor;
    }
     
    public String getMarca() {
        return marca;
    }

    public void setMarca(String valor) {
        this.marca = valor;
    }
    
    public String getUnidad() {
        return unidad;
    }
    
    public void setUnidad(String valor) {
        this.unidad = valor;
    }
    
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double valor) {
        this.precio = valor;
    }
    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double valor) {
        this.cantidad = valor;
    }
    
   
    
    public double calcularMonto() {
        return precio * cantidad;
    }
    
    public void imprimirDatos() {
        
        System.out.println("---- DATOS PRODUCTO ----");
        System.out.println("Nombre:" + nombre);
        System.out.println("Marca:" + marca);
        System.out.println("Unidad:" + unidad);
        System.out.println("Precio:" + precio);
        System.out.println("Cantidad: " + cantidad);
    }
    
    public void imprimirConMonto() {
        imprimirDatos();
        
        System.out.println("Monto:" + calcularMonto()); 
    }
}
