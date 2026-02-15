/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_cuenta_bancaria;

/**
 *
 * @author bisonte
 */
public class EVA1_9_CUENTA_BANCARIA {

    public static void main(String[] args) {
       
        Cuentabancaria cuenta = new Cuentabancaria("Juan Perez", 1000);
        cuenta.ImprimirDatos();
        
        cuenta.depositar(500);
        cuenta.imprimirsaldo();
        
        cuenta.depositar(180);
        cuenta.imprimirsaldo();
        
        cuenta.retirar(700);
        cuenta.imprimirsaldo();
        
        cuenta.retirar(1000);
        cuenta.imprimirsaldo();
        
    }
}
