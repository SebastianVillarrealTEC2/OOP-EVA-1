/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_14examen;

/**
 *
 * @author bisonte
 */
public class TestCovid {

    private int edad;
    private boolean cronica;
    private double peso;
    private double estatura;
    
    
    
    public TestCovid(){
        this.edad=30;
        this.estatura=1.7;
        this.cronica= false;
        this.peso= 50;
        
    }

    public TestCovid(int edad, boolean cronica, double peso, double estatura ) {
        this.edad = edad;
        this.cronica = cronica;
        this.peso = peso;
        this.estatura = estatura;
        
    }
    

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setCronica(boolean cronica) {
        this.cronica = cronica;
    }

    public boolean isCronica() {
        return cronica;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getEstatura() {
        return estatura;
    }
    
    private double calcularIMC(){
        return peso/(estatura*estatura);
    }
    public String calcularPersonasRiesgo(){
        String resu = "PERSONA SIN RIESGO";
                if((edad >= 65 ) || (cronica) || (calcularIMC()> 30))
                    resu= "PERSONA SIN RIESGO";
                return resu;
    }
}


//2D 