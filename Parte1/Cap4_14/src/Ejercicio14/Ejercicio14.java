package Ejercicio14;
// Importar Escaner
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

        System.out.println("Ingrese las ventas del departamento 1");
        ventasDep1 = input.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2");
        ventasDep2 = input.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3");
        ventasDep3 = input.nextDouble();
        System.out.println("Ingrese el salario de los vendedores ");
        salarioVendedores = input.nextDouble();

        // Sacar porcentaje de las ventas totales
        double porcentajeVentas = (ventasDep1 + ventasDep2 + ventasDep3) * 0.33;

        // Establecer salarios base
        double salario1, salario2, salario3;
        salario1 = salario2 = salario3 = salarioVendedores;

        // Condicionales para comprobar porcentaje de ventas
        if (ventasDep1 > porcentajeVentas){
            salario1 = salarioVendedores * 1.2;
        }
        if (ventasDep2 > porcentajeVentas){
           salario2 = salarioVendedores * 1.2;
        }
        if (ventasDep3 > porcentajeVentas){
            salario3 = salarioVendedores * 1.2;
        }

        // Imprimir salarios por departamento
        System.out.println("El salario del departamento de ventas 1 es: $" + salario1);
        System.out.println("El salario del departamento de ventas 2 es: $" + salario2);
        System.out.println("El salario del departamento de ventas 3 es: $" + salario3);
    }
}
