/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg2;

/**
 *
 * @author USUARIO
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Ejercicio 10
        
        /**int a = 300000;
        
        if (a > 200000 ) {
        
        System.out.println("Si es mayor el envio es gratis");
        
        }else if (a < 200000) {
        
        System.out.println("El envio cuesta 15000");
        
        }else {
        
        System.out.println("Agregue el valor valido ");
        
        }**/ 
        
        //ejercicio 11
        
        

        /**double compra = 1.000;
        double descuento = 500;
        double totalPagar = 2.000;

        // Pedir el valor de la compra
        System.out.print("Ingrese el valor de la compra: $");
      
        if (compra <= 100000) {
    System.out.println("Valor compra: " + compra + 
                       "\nDescuento: 0" +
                       "\nTotal a pagar: " + compra);

    } else if (compra <= 300000) {
    System.out.println("Valor compra: " + compra +
                       "\nDescuento: " + (compra * 0.10) +
                       "\nTotal a pagar: " + (compra - compra * 0.10));

    } else {
    System.out.println("Valor compra: " + compra +
                       "\nDescuento: " + (compra * 0.20) +
                       "\nTotal a pagar: " + (compra - compra * 0.20));
    }**/
        
        //ejercicio 12 
        
         /**double lado1 = 5;
        double lado2 = 5;
        double lado3 = 5;

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {

            System.out.println("Los lados deben ser mayores que cero.");

        } else if (lado1 + lado2 <= lado3 ||
                   lado1 + lado3 <= lado2 ||
                   lado2 + lado3 <= lado1) {

            System.out.println("No forman un triángulo.");

        } else if (lado1 == lado2 && lado2 == lado3) {

            System.out.println("Es un triángulo equilátero.");

        } else if (lado1 == lado2 ||
                   lado1 == lado3 ||
                   lado2 == lado3) {

            System.out.println("Es un triángulo isósceles.");

        } else {

            System.out.println("Es un triángulo escaleno.");
        }**/
        
        //ejercicio 13
        
         /**double saldo = 500000;
        double retiro = 200000;

        if (retiro <= 0) {

            System.out.println("El retiro debe ser mayor que cero.");

        } else if (retiro > saldo) {

            System.out.println("No existe saldo suficiente.");

        } else {

            saldo = saldo - retiro;

            System.out.println("Retiro realizado correctamente.");
            System.out.println("Saldo restante: " + saldo);
        }**/
         
         //ejercicio 14
         
          /**int horas = 4;
        double valorTotal;

        if (horas <= 0) {

            System.out.println("El tiempo debe ser mayor que cero.");

        } else if (horas == 1) {

            valorTotal = 5000;

            System.out.println("Valor total: $" + valorTotal);

        } else if (horas <= 5) {

            valorTotal = 5000 + (horas - 1) * 4000;

            System.out.println("Valor total: $" + valorTotal);

        } else {

            valorTotal = 5000 + 4 * 4000 + (horas - 5) * 3500;

            System.out.println("Valor total: $" + valorTotal);
        }**/
          
          //ejercicio 15
          
           /**int temperatura = 20;

        if (temperatura < 0) {

            System.out.println("Congelación.");

        } else if (temperatura <= 15) {

            System.out.println("Frío.");

        } else if (temperatura <= 25) {

            System.out.println("Templado.");

        } else {

            System.out.println("Calor.");
        }**/
           
           //ejercicio 16
           
        /**double peso = 70;
        double estatura = 1.70;
        double imc;

        imc = peso / (estatura * estatura);

        System.out.println("IMC: " + imc);

        if (imc < 18.5) {

            System.out.println("Bajo peso.");

        } else if (imc < 25) {

            System.out.println("Normal.");

        } else if (imc < 30) {

            System.out.println("Sobrepeso.");

        } else {

            System.out.println("Obesidad.");
        }**/
        
        //ejercicio 17
        
        /**double valor = 100000;
        double valorFinal = 0;
        int estrato = 2;

      if (estrato == 1) {

        valorFinal = valor - (valor * 0.50);
        System.out.println("Valor final: $" + valorFinal);

    } else if (estrato == 2) {

        valorFinal = valor - (valor * 0.30);
        System.out.println("Valor final: $" + valorFinal);

    } else if (estrato == 3) {

        valorFinal = valor - (valor * 0.15);
        System.out.println("Valor final: $" + valorFinal);

    } else if (estrato == 4) {

        valorFinal = valor;
        System.out.println("Valor final: $" + valorFinal);

    } else if (estrato == 5) {

        valorFinal = valor + (valor * 0.10);
        System.out.println("Valor final: $" + valorFinal);

    } else if (estrato == 6) {

        valorFinal = valor + (valor * 0.20);
        System.out.println("Valor final: $" + valorFinal);

    } else {

        System.out.println("Estrato no válido.");
    }**/

        //ejercicio 18
        
        /**int opcion = 2;

        if (opcion == 1) {

            System.out.println("Producto: Hamburguesa");
            System.out.println("Precio: $15000");

        } else if (opcion == 2) {

            System.out.println("Producto: Pizza");
            System.out.println("Precio: $20000");

        } else if (opcion == 3) {

            System.out.println("Producto: Perro caliente");
            System.out.println("Precio: $12000");

        } else if (opcion == 4) {

            System.out.println("Producto: Salchipapa");
            System.out.println("Precio: $10000");

        } else {

            System.out.println("Error: opción no válida.");
        }**/
        
           //ejercicio 20
           
        /**String usuario = "admin";
        String contraseña = "1234";

        if (usuario.equals("admin") && contraseña.equals("1234")) {

            System.out.println("Bienvenido al sistema.");

        } else {

            System.out.println("Usuario o contraseña incorrectos.");
        }**/
        
            //ejercicio 21
            
            /**int numero = 15;

        if (numero % 3 == 0 && numero % 5 == 0) {

            System.out.println("El número es múltiplo de 3 y de 5.");

        } else {

            System.out.println("El número no es múltiplo de 3 y de 5.");
        }**/
            
            //ejercicio 22
            
        /**double nota = 3.5;
        double asistencia = 90;

        if (nota >= 3.0 && asistencia > 80) {

            System.out.println("El estudiante aprueba la materia.");

        } else {

            System.out.println("El estudiante no aprueba la materia.");
        }**/
        
            //ejercicio 23
            
        /**int edad = 25;
        double ingresos = 3000000;

        if (edad > 21 && ingresos > 2000000) {

            System.out.println("Puede solicitar la tarjeta de crédito.");

        } else {

            System.out.println("No puede solicitar la tarjeta de crédito.");
        }**/
        
            //ejercicio 24
            
            
        /**int numero1 = 10;
        int numero2 = 25;
        int numero3 = 7;
        int numero4 = 18;

        if (numero1 >= numero2 && numero1 >= numero3 && numero1 >= numero4) {

            System.out.println("El número mayor es: " + numero1);

        } else if (numero2 >= numero1 && numero2 >= numero3 && numero2 >= numero4) {

            System.out.println("El número mayor es: " + numero2);

        } else if (numero3 >= numero1 && numero3 >= numero2 && numero3 >= numero4) {

            System.out.println("El número mayor es: " + numero3);

        } else {

            System.out.println("El número mayor es: " + numero4);
        }


        if (numero1 <= numero2 && numero1 <= numero3 && numero1 <= numero4) {

            System.out.println("El número menor es: " + numero1);

        } else if (numero2 <= numero1 && numero2 <= numero3 && numero2 <= numero4) {

            System.out.println("El número menor es: " + numero2);

        } else if (numero3 <= numero1 && numero3 <= numero2 && numero3 <= numero4) {

            System.out.println("El número menor es: " + numero3);

        } else {

            System.out.println("El número menor es: " + numero4);
        }**/
        
            //ejercicio 25
            
        /**int edad = 15;
        int precio;

        if (edad < 12) {

            precio = 8000;
            System.out.println("Precio de la entrada: $" + precio);

        } else if (edad <= 60) {

            precio = 15000;
            System.out.println("Precio de la entrada: $" + precio);

        } else {

            precio = 10000;
            System.out.println("Precio de la entrada: $" + precio);
        }**/
        
        
    }
    
}
