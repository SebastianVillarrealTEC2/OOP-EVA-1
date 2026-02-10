/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mavenproject2.eva1_5_vehiculo;

/**
 *
 * @author bisonte
 */
public class EVA1_5_VEHICULO {

    public static void main(String[] args) {
        /*Vehiculo vehiculo= new Vehiculo();
        //clase  //identicador
        
        vehiculo.setMarca("Ford");
        vehiculo.setModelo("Mustang");
        vehiculo.setYear(1970);
        vehiculo.setColor("Azul");
        vehiculo.setKilometraje(100000);
        vehiculo.setPrecio(1000000);
        vehiculo.ImprimirDatos();*/
        
       Vehiculo[] agencia= new Vehiculo[10];// aqui creamos el arreglo pero no los vehiculos 
       //10 objetos y 1 arreglo, 11 objetos 
       for (int i = 0; i < agencia.length; i++) {
           //creamos el arreglo para la posicion 
        agencia[i]= new Vehiculo();
        agencia[i].setMarca("Ford");
        agencia[i].setModelo("Mustang");
        agencia[i].setYear(1970);
        agencia[i].setColor("Azul");
        agencia[i].setKilometraje(100000);
        agencia[i].setPrecio(1000000);
        agencia[i].ImprimirDatos();
           
            
        }
        
        
    }
}
