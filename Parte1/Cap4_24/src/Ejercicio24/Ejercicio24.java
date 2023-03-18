package Ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        // Crear Scanner para leer entradas por teclado
        Scanner input = new Scanner(System.in);
        //poner delimitador de línea (para que acepte espacios en nombre)
        input.useDelimiter("\r?\n");

        //Declarar las variables, pedirlas y leerlas
        System.out.println("Bienvenid@ por favor ingresa los datos: " + "\n");

        System.out.println("Ingrese el peso de la esfera 1");
        double esfera1 = input.nextDouble();
        System.out.println("Ingrese el peso de la esfera 2");
        double esfera2 = input.nextDouble();
        System.out.println("Ingrese el peso de la esfera 3");
        double esfera3 = input.nextDouble();

        // Algoritmo para determinar el maximo
        double maximo = esfera1;
        String nombreMax = "Esfera 1";
        if (maximo < esfera2){ maximo = esfera2; nombreMax = "Esfera 2";}
        if (maximo < esfera3){maximo = esfera3; nombreMax= "Esfera 3";}
        System.out.println("La esfera de mayor peso es la: " + nombreMax +
                " con un peso de: " + maximo);


    }
}
