package Ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        // Crear variables
        String numeroInscripcion;
        double patrimonio;
        int estratoSocial;

        // Crear Scanner para leer entradas por teclado
        Scanner input = new Scanner(System.in);
        //poner delimitador de línea (para que acepte espacios en nombre)
        input.useDelimiter("\r?\n");

        //Leer las entradas
        System.out.println("Bienvenid@ ingrese por favor los datos a continuación para liquidar su matricula: ");
        System.out.println();
        System.out.println("Ingrese el número de inscripción: ");
        numeroInscripcion = input.next();
        System.out.println("Ingrese los nombres del estudiante: ");
        String nombres = input.next();
        System.out.println("Ingrese el valor del patrimonio: ");
        patrimonio = input.nextDouble();
        System.out.println("Ingrese su estrato social: ");
        estratoSocial = input.nextInt();

        // Condicional
        double valorMatricula = 50000.0;
        if (patrimonio > 2000000 && estratoSocial > 3){
            valorMatricula = valorMatricula + (patrimonio*0.03);
        }

        // Imprimir datos y valor matricula
        System.out.println("El estudiante con número de inscripción "
        + numeroInscripcion + " y nombre " + nombres + " debe pagar $" + valorMatricula);

    }
}
