package Ejercicio15;
import java.util.Scanner;

/* ENUNCIADO:
 * Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
 * diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
 * o menor peso. 
 */

public class Ejercicio15 {

    public static void main(String[] args) {
        // Creamos el scaner
        Scanner sc = new Scanner(System.in);
        // Ingresamos los pesos de las esferas
        System.out.println("Ingrese el peso de la esfera A: ");
        int pesoA = sc.nextInt();
        
        System.out.println("Ingrese el peso de la esfera B: ");
        int pesoB = sc.nextInt();
        
        System.out.println("Ingrese el peso de la esfera C: ");
        int pesoC = sc.nextInt();
        
        System.out.println("Ingrese el peso de la esfera D: ");
        int pesoD = sc.nextInt();
        
        // Usamos el algoritmo correspondiente
        if (pesoA == pesoB && pesoA == pesoC) {
            if (pesoD > pesoA) {
                System.out.println("La esfera D es la diferente y es de mayor peso");
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso");
            }
        } else if (pesoA == pesoB && pesoA == pesoD) {
            System.out.println("La esfera C es la diferente");
            if (pesoC > pesoA) {
                System.out.println("y es de mayor peso");
            } else {
                System.out.println("y es de menor peso");
            }
        } else if (pesoA == pesoC && pesoA == pesoD) {
            System.out.println("La esfera B es la diferente");
            if (pesoB > pesoD) {
                System.out.println("y es de mayor peso");
            } else {
                System.out.println("y es de menor peso");
            }
        } else {
            System.out.println("La esfera A es la diferente");
            if (pesoA > pesoB) {
                System.out.println("y es de mayor peso");
            } else {
                System.out.println("y es de menor peso");
            }
        }
        
        // Cerramos el scaner
        sc.close();
    }

}
