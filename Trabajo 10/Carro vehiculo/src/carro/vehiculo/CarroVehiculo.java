/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carro.vehiculo;

/**
 *
 * @author USUARIO
 */


    /**
     * @param args the command line arguments
     */
    
    public class Carro extends Vehiculo {
   
    private int numeroPuertas;
   
    public Carro(String marca, String placa, int cilindrada, String modelo,int numeroPuertas) {
        super(marca, placa, cilindrada, modelo);
        this.numeroPuertas=numeroPuertas;
   
    }

    @Override
    public void start(){
        System.out.println("arrancando el carro..");
    }
   
    @Override
    public void stop(){
        System.out.println("deteniendo el carro..");
    }
    public void numeroPuertas(){
        System.out.println("Numero puertas: "+this.numeroPuertas);
    }
}
