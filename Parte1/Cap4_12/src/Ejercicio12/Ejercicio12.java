package Ejercicio12;
// Importar Escaner
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        // Definir las variables
        String nombreTrabajador;
        double numeroHoras, valorHora, horasExtra, horasExtra8, salario;

        // Crear Scanner para leer entradas por teclado
        Scanner input = new Scanner(System.in);
        //poner delimitador de línea (para que acepte espacios en nombre)
        input.useDelimiter("\r?\n");

        // Pedir y leer las entradas por teclado
        System.out.println("Bienvenid@ por favor ingrese los siguientes datos:" + "\n");
        System.out.println("Ingrese el nombre del trabajador: ");
        nombreTrabajador = input.next();
        System.out.println("Ingrese el número de horas trabajadas: ");
        numeroHoras = input.nextDouble();
        System.out.println("Ingres el valor hora normal: ");
        valorHora = input.nextDouble();

        // Establecer los condicionales
        if (numeroHoras > 40){
            horasExtra = numeroHoras - 40;
            if(horasExtra > 8){
                horasExtra8 = horasExtra - 8;
                salario = 40 * valorHora + 16 * valorHora + horasExtra8 * 3 * valorHora;
            }
            else {
                salario = 40 * valorHora + horasExtra * 2 * valorHora;
            }
        }
        else {
            salario = numeroHoras * valorHora;
        }

        // Imprimir los datos
        System.out.println("El trabajador " + nombreTrabajador + " devengó $" + salario);

    }
}
