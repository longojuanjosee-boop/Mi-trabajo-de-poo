/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.de.luchadores;
import java.util.Random;

public class Arquera extends Luchador {
    
    private int flechaEnvenenada;
    private int cooldownHabilidad = 0;
    
    public Arquera () {
        
        this.hp = 1000;
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
                tiro1 = resultado;
            }
            if (k == 2 ) {
                tiro2 = resultado;
            }
            if (k == 3 ) {
                tiro3 = resultado;
            }
        }
        
        if (tiro1 >= tiro2 && tiro1 >= tiro3) {
            this.agilidad = tiro1;
            if (tiro2 >= tiro3) {
                this.fuerza = tiro2;
                this.inteligencia = tiro3;
            } else {
                this.fuerza = tiro3;
                this.inteligencia = tiro2;
            }
        }
        
        if (tiro2 >= tiro1 && tiro2 >= tiro3) {
            this.agilidad = tiro2;
            if (tiro1 >= tiro3) {
                this.fuerza = tiro1;
                this.inteligencia = tiro3;
            } else {
                this.fuerza = tiro3;
                this.inteligencia = tiro1;
            }
        }
        
        if (tiro3 >= tiro1 && tiro3 >= tiro2) {
            this.agilidad = tiro3;
            if (tiro1 >= tiro2) {
                this.fuerza = tiro1;
                this.inteligencia = tiro2;
            } else {
                this.fuerza = tiro2;
                this.inteligencia = tiro1;
            }
        }
    }

    public void reducirCooldown() {
        if (this.cooldownHabilidad > 0) {
            this.cooldownHabilidad--;
        }
    }

    public void usarFlechaEnvenenada(Luchador enemigo) {
        if (this.cooldownHabilidad > 0) {
            System.out.println("Flecha Envenenada en enfriamiento");
            return;
        }

        System.out.println("Ataque especial FLECHA ENVENENADA");
        Dado dados = new Dado();
        Random random = new Random();
        
        int ataqueHabilidad = dados.rd20() + (this.ataque / 10) + (this.agilidad / 10);
        int dadoDefensa = random.nextInt(20) + 1;
        int defensaEnemigo = dadoDefensa + (enemigo.agilidad / 10);

        if (ataqueHabilidad > defensaEnemigo) {
            int dadoD8 = random.nextInt(8) + 1;
            int danoInicial = dadoD8 + (this.agilidad / 5); 
            System.out.println("Impacto Dano inicial " + danoInicial);
            
            enemigo.hp = enemigo.hp - danoInicial;
            if (enemigo.hp < 0) {
                enemigo.hp = 0;
            }
            
            this.cooldownHabilidad = 3; 
        } else {
            System.out.println("El ataque especial fallo");
        }
    }
}


