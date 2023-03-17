package Ejercicio13;

import java.util.Scanner;

/* ENUNCIADO
 * Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
 * compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
 * es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
 * amarilla un 25%, si es azul un
 * 50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un
 * cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
 * mencionados. 
 */

public class Ejercicio13 {
    public static void main(String[] args) {

        // Definimos las variables
        double valComp, valPag;
        int pDes = 0;
        String color;

        // Pedimos los valores de la compra y el color al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra: ");
        valComp = scanner.nextDouble();
        System.out.print("Ingrese el color de la bolita (BLANCO, VERDE, AMARILLO, AZUL o ROJO): ");
        color = scanner.next().toUpperCase();

        // Encontramos el porcentaje de descuento según el color de la bolita
        if(color.equalsIgnoreCase("verde")) {
            pDes = 10;
        } else if(color.equalsIgnoreCase("amarillo")) {
            pDes = 25;
        } else if(color.equalsIgnoreCase("azul")) {
            pDes = 50;
        } else if(color.equalsIgnoreCase("rojo")) {
            pDes = 100;
        }

        // Calculamos el valor final a pagar
        valPag = valComp - pDes * valComp / 100;

        // Imprimimos el resultado
        System.out.println("El cliente debe pagar: $" + valPag);
        
        // Cerramos el scanner
    	scanner.close();
    }
}
