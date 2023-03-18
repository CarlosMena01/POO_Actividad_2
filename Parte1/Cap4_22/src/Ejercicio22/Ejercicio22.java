package Ejercicio22;
// Importar Escaner
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        // Crear Scanner para leer entradas por teclado
        Scanner input = new Scanner(System.in);
        //poner delimitador de línea (para que acepte espacios en nombre)
        input.useDelimiter("\r?\n");

        //Pedir y leer las variables
        System.out.println("Bienvenido por favor ingrese los datos:" +"\n");

        //Declarar variables, pedirlas y leerlas
        System.out.println("Nombre del empleado: ");
        String nombre = input.next();
        System.out.println("Valor de la hora de trabajo");
        double valorHora = input.nextInt();
        System.out.println("Número de horas trabajadas: ");
        int horasTrabajadas = input.nextInt();

        //Calculo salario
        double salario = valorHora*horasTrabajadas;

        // Condicional y salidas
        if (salario > 450000){
            System.out.println("El nombre del trabajador es: " + nombre);
            System.out.println("Su salario mensual es de: " + salario);
        }
        else {
            System.out.println("El nombre del trabajador es: " + nombre);
        }

    }

}
