/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.de.luchadores;
import java.util.Random;

public class Mago extends Luchador {
    
/**
 *
 * @author USUARIO
 */
    // atributos, solo de la clase
    private int bolaDeFuego;
    
    public Mago () {
        
        this.hp = 1000;
        
        // llamo a la clase dado y creo una variable llamada dados para usar las funciones
        Dado dados = new Dado();
        
        int i = 3;
        int k;
        int tiro1 = 0;
        int tiro2 = 0;
        int tiro3 = 0;
        
        for (k=1; k<=i; k++) {
            
            int resultado = dados.rd100();
            
            System.out.println("resultado " +k+ ": " +resultado);
            
            if (k == 1 ) {
                
                tiro1= resultado;
            }
            
            if (k == 2 ) {
                
                tiro2= resultado;
            }
            
            if (k == 3 ) {
                
                tiro3= resultado;
            }
        }
        
        // caso de que el tiro 1 sea el mas grande (va para inteligencia)
        if (tiro1 >= tiro2 && tiro1 >= tiro3) {
            
            this.inteligencia = tiro1;
            
            if (tiro2 >= tiro3) {
                
                this.fuerza = tiro2;
                this.agilidad = tiro3;
                
            } else {
                
                this.fuerza = tiro3;
                this.agilidad = tiro2;
            }
        }
        
        // caso de que el tiro 2 sea el mas grande (va para inteligencia)
        if (tiro2 >= tiro1 && tiro2 >= tiro3) {
            
            this.inteligencia = tiro2;
            
            if (tiro1 >= tiro3) {
                
                this.fuerza = tiro1;
                this.agilidad = tiro3;
                
            } else {
                
                this.fuerza = tiro3;
                this.agilidad = tiro1;
            }
        }
        
        // caso de que el tiro 3 sea el mas grande (va para inteligencia)
        if (tiro3 >= tiro1 && tiro3 >= tiro2) {
            
            this.inteligencia = tiro3;
            
            if (tiro1 >= tiro2) {
                
                this.fuerza = tiro1;
                this.agilidad = tiro2;
                
            } else {
                
                this.fuerza = tiro2;
                this.agilidad = tiro1;
            }
        }
    }
}
