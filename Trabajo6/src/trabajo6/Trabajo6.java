/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo6;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Trabajo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        //ejercicio 1
        
        
       //int cantidad;
        //int numero;
        //int mayores = 0;
        //int menores = 0;
        //int iguales = 0;

        //System.out.print("¿Cuántos números desea introducir?: ");
        //cantidad = sc.nextInt();

        //for (int i = 1; i <= cantidad; i++) {
            //System.out.print("Ingrese el número " + i + ": ");
            //numero = sc.nextInt();

            //if (numero > 0) {
                //mayores++;
            //} else if (numero < 0) {
                //menores++;
            //} else {
                //iguales++;
            //}
        //}

        //System.out.println("Mayores que 0: " + mayores);
        //System.out.println("Menores que 0: " + menores);
        //System.out.println("Iguales a 0: " + iguales);
        
        //ejercico 2
        
        /**char  letra;

        System.out.print("Ingrese una letra: ");
        letra = sc.next().charAt(0);

        if (letra == 'a' || letra == 'A') {
            System.out.println("VOCAL");
        } else if (letra == 'e' || letra == 'E') {
            System.out.println("VOCAL");
        } else if (letra == 'i' || letra == 'I') {
            System.out.println("VOCAL");
        } else if (letra == 'o' || letra == 'O') {
            System.out.println("VOCAL");
        } else if (letra == 'u' || letra == 'U') {
            System.out.println("VOCAL");
        } else {
            System.out.println("NO VOCAL");
        }**/
        
        //ejercicio 3
        
         /**System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        for (int k = num1; k <= num2; k++) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }**/
         
         //ejercicio 4
         
         /**System.out.print("Ingrese el límite inferior: ");
        int inferior = sc.nextInt();

        System.out.print("Ingrese el límite superior: ");
        int superior = sc.nextInt();

        int suma = 0;
        int fuera = 0;
        boolean limite = false;

        for (int k = 1; k <= 10; k++) {
            System.out.print("Ingrese el número " + k + ": ");
            int numero = sc.nextInt();

            if (numero > inferior && numero < superior) {
                suma = suma + numero;
            } else if (numero < inferior || numero > superior) {
                fuera++;
            } else {
                limite = true;
            }
        }

        System.out.println("Suma de los números dentro del intervalo: " + suma);
        System.out.println("Cantidad de números fuera del intervalo: " + fuera);

        if (limite) {
            System.out.println("Se introdujo algún número igual a los límites.");
        } else {
            System.out.println("No se introdujo ningún número igual a los límites.");
        }**/
         
         //ejercicio 5
         
           /**System.out.print("Ingrese el número: ");
        double numero = sc.nextDouble();

        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();

        double resultado = 1;

        if (exponente > 0) {
            for (int k = 1; k <= exponente; k++) {
                resultado = resultado * numero;
            }

            System.out.println("El resultado es: " + resultado);

        } else if (exponente == 0) {
            System.out.println("El resultado es: 1");

        } else {
            for (int k = 1; k <= -exponente; k++) {
                resultado = resultado * numero;
            }

            resultado = 1 / resultado;

            System.out.println("El resultado es: " + resultado);
        }**/
           
           //ejercicio 6
           
            /**System.out.print("Ingrese un número entre 1 y 12: ");
        int numero = sc.nextInt();

        if (numero == 1) {
            System.out.println("Enero");
        } else if (numero == 2) {
            System.out.println("Febrero");
        } else if (numero == 3) {
            System.out.println("Marzo");
        } else if (numero == 4) {
            System.out.println("Abril");
        } else if (numero == 5) {
            System.out.println("Mayo");
        } else if (numero == 6) {
            System.out.println("Junio");
        } else if (numero == 7) {
            System.out.println("Julio");
        } else if (numero == 8) {
            System.out.println("Agosto");
        } else if (numero == 9) {
            System.out.println("Septiembre");
        } else if (numero == 10) {
            System.out.println("Octubre");
        } else if (numero == 11) {
            System.out.println("Noviembre");
        } else if (numero == 12) {
            System.out.println("Diciembre");
        } else {
            System.out.println("Error: el número debe estar entre 1 y 12.");
        }**/
            
            //ejercicio 7
            
            /**System.out.print("Ingrese el número del dado: ");
        int numero = sc.nextInt();

        if (numero == 1) {
            System.out.println("Seis");
        } else if (numero == 2) {
            System.out.println("Cinco");
        } else if (numero == 3) {
            System.out.println("Cuatro");
        } else if (numero == 4) {
            System.out.println("Tres");
        } else if (numero == 5) {
            System.out.println("Dos");
        } else if (numero == 6) {
            System.out.println("Uno");
        } else {
            System.out.println("ERROR: número incorrecto");
        }**/
        
        //ejercicio 8
        
        /**System.out.print("Ingrese un número del 1 al 7: ");
        int numero = sc.nextInt();

        if (numero == 1) {
            System.out.println("Lunes");
        } else if (numero == 2) {
            System.out.println("Martes");
        } else if (numero == 3) {
            System.out.println("Miércoles");
        } else if (numero == 4) {
            System.out.println("Jueves");
        } else if (numero == 5) {
            System.out.println("Viernes");
        } else if (numero == 6) {
            System.out.println("Sábado");
        } else if (numero == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Error: número incorrecto.");
        }**/
        
        //ejercicio 9
        
         //System.out.print("Ingrese un número: ");
        //int numero = sc.nextInt();

        //int factorial = 1;

        //for (int k = 1; k <= numero; k++) {
            //factorial = factorial * k;
        //}

        //System.out.println("El factorial es: " + factorial);
        
        //ejercicio 10
    
      
          for (int k = 1; k <= 6; k++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        }
     
    
    }

 