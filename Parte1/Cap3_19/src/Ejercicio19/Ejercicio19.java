package Ejercicio19;

import java.util.Scanner;

/*	ENUNCIADO:
 * Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
 * perímetro, el valor de la altura y el área del triángulo. */

public class Ejercicio19 {
    public static void main(String[] args) {

        // Pedimos el valor del lado al usuario
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado del triángulo equilátero: ");
        double lado = scan.nextDouble();

        // Calculamos el perímetro, la altura y el área del triángulo
        double perimetro = 3 * lado;
        double altura = Math.sqrt(3) / 2 * lado;
        double area = (Math.sqrt(3) / 4) * Math.pow(lado, 2);

        // Imprimimos los resultados
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area);
        
		//	Cerramos el scanner
		scan.close();
    }
}

