/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_9_cuenta_bancaria;

/**
 *
 * @author bisonte
 */
public class Cuentabancaria {
    private String titular;
    private double monto;
    
    
   public Cuentabancaria(String titular, double monto ) {
        this.titular = titular;
        this.monto = monto;
    }
   
   public void ImprimirDatos(){
       System.out.println("Titular:"+titular);
       System.out.println("Monto:"+ monto);
   }
   
   public void retirar( double monto){
       if (this.monto >= monto) {
            this.monto -= monto;
        } else {
            System.out.println("Monto insifuciente para realizar el retiro ");
        }
         
   }
   public void depositar( double monto){
       if (monto > 0) {
            this.monto += monto;
        } else {
            System.out.println(" ingrese mayor que 0");
        }
       
   }
   public void imprimirsaldo(){
       System.out.println("Saldo:"+ monto);
   }
    
}
