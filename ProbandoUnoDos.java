
package EjerciciosUnidad2;

import java.util.Scanner;

public class ProbandoUnoDos {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        byte numerito = 127;
        short numerillo = -4000;
        long numeraco = 1000000;
        float numeroYalgo = 4;
        double numeroYalgos = 2.3;
        boolean siOno = false;
        char unaLetra = 'e';
        String oracion = "como qué lo qué";
        double decimales = 3.55;
        boolean bandera = false;
        System.out.println("Quiero ir de pari x " + numeraco);
        
        Scanner leer = new Scanner (System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre = leer.next();
        int edad;
        System.out.println("Ingresa tu edad");
        edad = leer.nextInt();
        System.out.println("Me llamo " + nombre + " y tengo " +  edad + "años. Pero sin embargo puedo seguir aprendiendo cosas. EN TU CARA.");
    
    
    }
    }