/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculo;

/**
 *
 * @author USUARIO
 */


    /**
     * @param args the command line arguments
     */
    
    
 protected String marca;
    protected String modelo;
    protected String placa;
    protected int cilindrada;
   
    //constructores
   
   
    public Vehiculo(String marca, String placa, int cilindrada, String modelo) {
        this.marca = marca;
        this.placa = placa;
        this.cilindrada = cilindrada;
        this.modelo = modelo;
       
    }

    public Vehiculo(String marca, String modelo, int nivel_c) {
        this.marca = marca;
        this.modelo = modelo;
     
    }
   
    //metodos io funciones SET y GET
   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

   
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
   
    //funciones y metodos de clase
   
    public void mostrar_info(){//String marca, String placa, String cilindrada, String modelo, int nivel_c, int vel_ini, int incremento_v, int decremento_v, int cantidad_c
   
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Placa: "+this.placa);
        System.out.println("Cilindrada: "+this.cilindrada);
       
   
    }
   
    public void start (){
       
        System.out.println("arrancando vehiculo....");
    }
   
    public void stop(){
   
        System.out.println("deteniendo vehiculo...");
    }

