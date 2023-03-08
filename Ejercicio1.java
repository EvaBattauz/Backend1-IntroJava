/*
 *Escribir un programa que pida dos números enteros por teclado
 *y calcule la suma de los dos. El programa deberá después mostrar
 *el resultado de la suma.
 */
package EjerciciosUnidad2;

import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
         Scanner leer = new Scanner (System.in);
         System.out.println("Ingresa un número");
         int num1;
         num1 = leer.nextInt();
         System.out.println("Vuelve a ingresar un número");
         int num2;
         num2 = leer.nextInt();
         System.out.println("La suma de los números es: " + (num1 + num2));
}
}
