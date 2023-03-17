package Ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        // Definir variables
        double ventasDep1, ventasDep2, ventasDep3, salarioVendedores;

        // Crear Scanner para leer entradas por teclado
        Scanner input = new Scanner(System.in);
        //poner delimitador de línea (para que acepte espacios en nombre)
        input.useDelimiter("\r?\n");

        // Pedir y leer las entradas
        System.out.println("Bienvenid@ a continuación ingrese los datos" + "\n");
        System.out.println("Ingrese el salario de los vendedores ");
        salarioVendedores = input.nextDouble();
        System.out.println("Ingrese las ventas del departamento 1");
        ventasDep1 = input.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2");
        ventasDep2 = input.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3");
        ventasDep3 = input.nextDouble();

        // Sacar porcentaje de las ventas totales
        Double porcentajeVentas = (ventasDep1 + ventasDep2 + ventasDep3) * 0.33;
        


        //


    }
}
