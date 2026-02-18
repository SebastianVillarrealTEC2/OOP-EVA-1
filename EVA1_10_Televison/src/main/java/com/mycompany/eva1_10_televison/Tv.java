/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_10_televison;

/**
 *
 * @author bisonte
 */
public class Tv {
    private boolean estadoTV;
    private int canal;
    private int volumen;
    
    public Tv (){
        estadoTV = false;
        canal= 0;
        volumen= 10;
    }
    
    public void prenderApagar(){
        /*if(estadoTV == false)
            estadoTV=true;
        else
        estadoTV = false;*/
        
        //variable booleana
        estadoTV = !estadoTV;
        
        
    }
    public void constultarEstadoTV(){
       if (estadoTV) {
            System.out.println("ESTADO DE LA TV");
            System.out.println("ENCENDIDA");
            System.out.println("Canal: " + canal);
            System.out.println("Volumen: " + volumen);
        } else {
            System.out.println("APAGADA");
        }
    }
    
    public void aumentarCanal(){
        if (estadoTV) {
            if (canal >= 100) {
                canal = 0;
            } else {
                canal++;
            }
        }
    }
     public void decrementarCanal(){
        if (estadoTV) {
            if (canal <= 0) {
                canal = 100;
            } else {
                canal--;
            }
        }
    }
      public void cambairCanal( int canal){
        if (estadoTV) {  //AND
            if (canal >= 0 && canal <= 100) {
                this.canal = canal;
            }
        }
    }
     
    public void aumentarvolumen(){
        if (estadoTV) {
            if (volumen < 100) {
                volumen++;
            }
        }
        }
    public void decrementarvolumne(){
        if (estadoTV) {
            if (volumen > 0) {
                volumen--;
            }
        }
    }
    }
    
    

    


