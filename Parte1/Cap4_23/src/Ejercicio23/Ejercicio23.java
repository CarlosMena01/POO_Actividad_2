package Ejercicio23;
import java.util.Scanner;

/* ENUNCIADO
 *  Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
 *  elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación. 
 */

public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        double c = scanner.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones reales son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La única solución real es:");
            System.out.println("x = " + x);
        } else {
            double real = -b / ( 2* a);
            double img = Math.sqrt( 4 * a * c - b * b) /(2 * a);
            System.out.println("Las soluciones complejas son:");
            System.out.println("x1 = " + real + " + " + img + "i");
            System.out.println("x1 = " + real + " - " + img + "i");
        }
    }
}
