/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulador.de.luchadores;
import java.util.Random;

/**
 *
 * @author USUARIO
 */
public class SimuladorDeLuchadores {

      public static void main(String[] args) {
          System.out.println("Inicio del combate en la arena");
        
        Mago mago = new Mago();
        Arquera arquera = new Arquera();
        
        int cooldownMago = 0;
        int cooldownArquera = 0;
        int turnosVeneno = 0;
        
        Random random = new Random();
        System.out.println("Los luchadores entran a la arena");
        int ronda = 1;
        
        while (mago.hp > 0 && arquera.hp > 0) {
            System.out.println("Comienza la ronda numero " + ronda);
            
            if (turnosVeneno > 0 && mago.hp > 0) {
                System.out.println("El veneno afecta al Mago y pierde 3 puntos de vida");
                mago.hp -= 3;
                turnosVeneno--;
            }
            if (mago.hp <= 0) break;
            
            System.out.println("Turno del mago");
            if (cooldownMago > 0) {
                cooldownMago--;
            }
            
            if (cooldownMago == 0) {
                System.out.println("El Mago lanza su habilidad especial Bola de Fuego");
                int dadoD20 = random.nextInt(20) + 1;
                int ataqueMago = dadoD20 + (mago.ataque / 10) + (mago.inteligencia / 10);
                
                int dadoDefensa = random.nextInt(20) + 1;
                int defensaArquera = dadoDefensa + (arquera.agilidad / 10);
                
                if (ataqueMago > defensaArquera) {
                    int dadoD10 = random.nextInt(10) + 1;
                    int danoMagico = dadoD10 + (mago.inteligencia / 5);
                    arquera.hp -= danoMagico;
                    System.out.println("La bola de fuego impacta y causa un dano de " + danoMagico);
                } else {
                    System.out.println("La arquera logra esquivar la bola de fuego");
                }
                cooldownMago = 3;
            } else {
                System.out.println("El Mago realiza un ataque normal");
                int dadoD20 = random.nextInt(20) + 1;
                int ataqueMago = dadoD20 + (mago.ataque / 10) + (mago.inteligencia / 10);
                
                int dadoDefensa = random.nextInt(20) + 1;
                int defensaArquera = dadoDefensa + (arquera.agilidad / 10);
                
                if (ataqueMago > defensaArquera) {
                    int dadoD6 = random.nextInt(6) + 1;
                    int danoNormal = dadoD6 + (mago.inteligencia / 10);
                    arquera.hp -= danoNormal;
                    System.out.println("El ataque fisico impacta y causa un dano de " + danoNormal);
                } else {
                    System.out.println("El ataque normal del mago ha fallado");
                }
            }
            
            System.out.println("Vida restante de la Arquera es " + (arquera.hp < 0 ? 0 : arquera.hp));
            if (arquera.hp <= 0) break;
            
            System.out.println("Turno de la arquera");
            if (cooldownArquera > 0) {
                cooldownArquera--;
            }
            
            if (cooldownArquera == 0) {
                System.out.println("La Arquera usa su habilidad especial Flecha Envenenada");
                int dadoD20 = random.nextInt(20) + 1;
                int ataqueArquera = dadoD20 + (arquera.ataque / 10) + (arquera.agilidad / 10);
                
                int dadoDefensa = random.nextInt(20) + 1;
                int defensaMago = dadoDefensa + (mago.agilidad / 10);
                
                if (ataqueArquera > defensaMago) {
                    int dadoD8 = random.nextInt(8) + 1;
                    int danoInicial = dadoD8 + (arquera.agilidad / 5);
                    mago.hp -= danoInicial;
                    System.out.println("La flecha envenenada impacta y causa un dano inicial de " + danoInicial);
                    turnosVeneno = 2;
                } else {
                    System.out.println("El Mago logra esquivar la flecha envenenada");
                }
                cooldownArquera = 3;
            } else {
                System.out.println("La Arquera realiza un ataque normal con su arco");
                int dadoD20 = random.nextInt(20) + 1;
                int ataqueArquera = dadoD20 + (arquera.ataque / 10) + (arquera.agilidad / 10);
                
                int dadoDefensa = random.nextInt(20) + 1;
                int defensaMago = dadoDefensa + (mago.agilidad / 10);
                
                if (ataqueArquera > defensaMago) {
                    int dadoD6 = random.nextInt(6) + 1;
                    int danoNormal = dadoD6 + (arquera.agilidad / 10);
                    mago.hp -= danoNormal;
                    System.out.println("La flecha impacta y causa un dano de " + danoNormal);
                } else {
                    System.out.println("El ataque normal de la arquera ha fallado");
                }
            }
            
            System.out.println("Vida restante del Mago es " + (mago.hp < 0 ? 0 : mago.hp));
            ronda++;
        }
        
        System.out.println("El combate ha terminado oficialmente");
        if (mago.hp > 0) {
            System.out.println("El Mago es el ganador de la arena");
        } else {
            System.out.println("La Arquera es la ganadora de la arena");
        }
    }
    
}
