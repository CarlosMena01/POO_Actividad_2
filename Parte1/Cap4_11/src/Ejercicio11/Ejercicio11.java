package Ejercicio11;
import java.util.Scanner;

/* ENUNCIADO
 * Escribir un algoritmo que acepte tres números enteros 
 * diferentes y muestre el mayor de ellos. 
 */

public class Ejercicio11 {
    public static void main(String[] args) {

        // Definimos las variables
        int n1, n2, n3, mayor;

        // Pedimos los valores de los tres números al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del primer número: ");
        n1 = scanner.nextInt();
        System.out.print("Ingrese el valor del segundo número: ");
        n2 = scanner.nextInt();
        System.out.print("Ingrese el valor del tercer número: ");
        n3 = scanner.nextInt();

        // Encontramos el valor mayor entre los tres números
        if (n1 > n2 && n1 > n3) {
            mayor = n1;
        } else {
        	if (n2 > n3) {
        		mayor = n2;
        	} else {
        		mayor = n3;
        	}
        }

        // Imprimimos el resultado
        System.out.println("El valor mayor entre " + n1 + ", " + n2 + " y " + n3 + " es: " + mayor);
        // Cerramos el scanner
    	scanner.close();
    }
}
