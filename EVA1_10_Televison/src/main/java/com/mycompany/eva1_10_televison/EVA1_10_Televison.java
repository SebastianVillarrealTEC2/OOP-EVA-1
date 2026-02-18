/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva1_10_televison;

/**
 *
 * @author bisonte
 */
public class EVA1_10_Televison {

    public static void main(String[] args) {
        Tv tele = new Tv();
        tele.constultarEstadoTV();
        tele.prenderApagar();
        tele.constultarEstadoTV();

        tele.aumentarCanal();
        tele.aumentarCanal();
        tele.aumentarCanal();
        tele.aumentarCanal();
        tele.aumentarCanal();
        tele.aumentarCanal();
        tele.constultarEstadoTV();
        tele.prenderApagar();
        tele.cambairCanal(50);
        tele.constultarEstadoTV();
        //volumen 6 cna canal 10
        tele.prenderApagar();
        tele.constultarEstadoTV();
        
        tele.aumentarCanal();
        tele.aumentarCanal();
        
        tele.aumentarvolumen();
        tele.aumentarvolumen();
        tele.aumentarvolumen();
        
        tele.constultarEstadoTV();
        //volumen 8 canal 13
        
        tele.prenderApagar();
        tele.constultarEstadoTV();
    }
}
