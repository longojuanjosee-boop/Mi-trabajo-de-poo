/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.de.luchadores;

/**
 *
 * @author USUARIO
 */

    //atributos
    public class Luchador {
        protected int hp;
        protected int ataque;
        protected int fuerza;
        protected int agilidad;
        protected int inteligencia;

    
    //Constructores
    public Luchador() {
        this.hp = 1000;
        this.ataque = 50;
        this.fuerza = 60;
        this.agilidad = 40;
        this.inteligencia = 80;
    }

    public Luchador(int hp, int ataque, int fuerza, int agelidad, int inteligencia) {
        this.hp = hp;
        this.ataque = ataque;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.inteligencia = inteligencia;
    }
    
    //Metodos y funciones set y get

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    //Metodos y funciones de clase
    
    
    public void hp(){
        System.out.println("Mostrar la vida" + hp);
        
    }
    
    public void ataque(){
         System.out.println("Mostrar el ataque que esta usando" + ataque);
    }
    
    public void fuerza(){
        System.out.println("Mostrar la fuerza que esta usando" + fuerza);
    }
    
    public void agilidad(){
        System.out.println("Mostrar la agilidad que tiene" + agilidad);
    }
    
    public void inteligencia(){
        System.out.println("Mostrar el la inteligencia que tiene" + inteligencia);
    }
}
