package Ejercicio21;

import java.util.Scanner;

/* ENUCIADO:
 * Dados los tres lados de un triángulo, haga un algoritmo que encuentre: perímetro,
 * semiperímetro y el área del triángulo. 
 */

public class Ejercicio21 {
    public static void main(String[] args) {

        // Pedimos los valores de los lados al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor del lado b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor del lado c: ");
        double c = scanner.nextDouble();

        // Calculamos el perímetro, el semiperímetro y el área del triángulo
        double perimetro = a + b + c;
        double semiperimetro = perimetro / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - a) * (semiperimetro - b) * (semiperimetro - c));

        // Imprimimos los resultados
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Semiperímetro: " + semiperimetro);
        System.out.println("Área: " + area);
        
		//	Cerramos el scanner
		scanner.close();
    }
}

