/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_temp;

/**
 *
 * @author bisonte
 */
public class EVA1_12_TEMP {

    public static void main(String[] args) {
        //Temperatura temp= new Temperatura();
         System.out.println("50 C = " + Temperatura.centAfahr(50) + " F");
        System.out.println("50 F = " + Temperatura.FahraCet(50) + " C");
        System.out.println("50 C = " + Temperatura.celaKel(50) + " K");
        System.out.println("323.15 K = " + Temperatura.kelacel(323.15) + " C");
        System.out.println("50 F = " + Temperatura.fahrAKel(50) + " K");
        System.out.println("323.15 K = " + Temperatura.kelAFahr(323.15) + " F");
        
    }
}

class Temperatura{
    public static double centAfahr(double cent){
        double resu;
        resu = (cent* (9.0/5.0)) + 32;
        return resu;
    }
    public static double FahraCet(double Fahr){
        double resu;
        resu = (Fahr - 32) * (5.0/9.0);
        return resu;
        
    }
    
    public static double celaKel(double cel){
        double resu;
        resu= cel + 273.15;
        return resu;
    }
    
    public static double kelacel(double kel){
        double resu;
        resu= kel - 273.15;
        return resu;
    }
    
    public static double fahrAKel(double fahr){
        double resu;
        resu = (5.0/9.0) * (fahr - 32) + 273.15;
        return resu;
    }

    public static double kelAFahr(double kel){
        double resu;
        resu = (9.0/5.0) * (kel - 273.15) + 32;
        return resu;
    }

    
}
