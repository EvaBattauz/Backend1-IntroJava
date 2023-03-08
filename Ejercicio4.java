/*
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)..
 */
package EjerciciosUnidad2;


public class Ejercicio4 {
    public static void main(String[] args) {
        
         int gradosCent = 30;
         double gradosFahr;
         gradosFahr = 32 + (9 * gradosCent / 5);
         System.out.println("Los " + gradosCent + " grados centígrados equivalen a " + gradosFahr + " grados fahrenheit");
         
             }
}
