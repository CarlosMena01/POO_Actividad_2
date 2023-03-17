package Ejercicio7;

import java.util.Scanner;

/* ENUNCIADO:
 * Hacer un algoritmo que, dados dos valores numéricos A y B, 
 * escriba un mensaje diciendo si A es mayor, menor o igual a B. 
 */

public class Ejercicio7 {
    public static void main(String[] args) {

        // Pedimos los valores de A y B al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double b = scanner.nextDouble();

        // Comparamos los valores de A y B y escribimos un mensaje correspondiente
        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else{
        	if (a == b){
                System.out.println(a + " es igual a " + b);
            } else {
            	System.out.println(a + " es menor que " + b);
            }
        } 
        
        // Cerramos el scanner
    	scanner.close();
    }
}

