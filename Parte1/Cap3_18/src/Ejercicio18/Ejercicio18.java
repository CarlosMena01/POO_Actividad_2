package Ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        // Declaración variables
        String codigoEmpleado;
        double horasTrabajadas, valorHora, porcentajeRetencion;

        // Crear Scanner para leer entradas por teclado
        Scanner input = new Scanner(System.in);
        //poner delimitador de línea (para que acepte espacios en nombre)
        input.useDelimiter("\r?\n");

        // Entradas por teclado
        System.out.println("Bienvenid@, ingrese el código del empleado: ");
        codigoEmpleado = input.next();
        System.out.println("Ingrese el nombre del empleado: ");
        String nombres = input.next();
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        horasTrabajadas = input.nextDouble();
        System.out.println("Ingrese el valor de la hora: ");
        valorHora = input.nextDouble();
        System.out.println("Ingrese el porcentaje de retención: ");
        porcentajeRetencion = input.nextDouble();

        // Salidas
        System.out.println();
        System.out.println("A continuación se muestran los datos del empleado");
        System.out.println("Codigo de identificación: " + codigoEmpleado);
        System.out.println("Nombres: " +nombres);
        System.out.println("Salario bruto: $" + valorHora*horasTrabajadas);
        System.out.println("Salario neto: $" + (valorHora*horasTrabajadas)*(1-(porcentajeRetencion/100)));

    }
}
