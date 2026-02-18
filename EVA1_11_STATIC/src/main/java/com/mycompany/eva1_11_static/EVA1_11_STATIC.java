/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_static;

/**
 *
 * @author bisonte
 */
public class EVA1_11_STATIC {
    
    public int x=100;

    public static void main(String[] args) {
        System.out.println(" *****MATH*****");
        //Math math= new Math();
        System.out.println(" PI= "+ Math.PI);
        System.out.println(" Random"+ Math.random());
        System.out.println(" Cuadrado(5)="+ Math.pow(5, 2));
        System.out.println(" *****MATEMATICAS*****");
        System.out.println("PI=" + Matematicas.PI);
        //Matematicas mate = new Matematicas(); //INSTACIACIÓN
        //System.out.println("PI="+ mate.PI);
        Matematicas mate = new Matematicas();
        System.out.println(" Cuadrado de 5="+ mate.cuadrado(5));
        EVA1_11_STATIC obj = new  EVA1_11_STATIC();
        System.out.println(" x="+ obj.x);
        
    }
    
}

class Matematicas {
    // objetivo de las class crear obj de modelos reales
    //static --> sirve para crear utileras sin necesidad de crear objetos
    // carga primero el codigo
    public static final  double PI=3.1416;
    public double cuadrado( double valor){
return valor*valor;
}
    

    
    
}