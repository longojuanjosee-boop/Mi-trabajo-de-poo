/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.de.luchadores;

import java.util.Random;

/**
 *
 * @author USUARIO
 */
public class Dado {
     //para toda la clase
      Random generador = new Random();
    
   public int rd4(){
       
       return generador.nextInt (4) + 1;
    
     }
       
       public int rd6(){
       
       return generador.nextInt (6) + 1;
    }
       
       public int rd10(){
       
       return generador.nextInt (10) + 1;
       
   }
       
       public int rd12(){
       
       return generador.nextInt (12) + 1;
       
   }
       
       public int rd20(){
       
       return generador.nextInt (20) + 1;
       
   }
       
       public int rd100(){
       
       return generador.nextInt (100) + 1;
       
   }
}
