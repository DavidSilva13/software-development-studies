/*Crea una aplicación que calcule la media aritmética de dos notas enteras. Hay que tener
en cuenta que la media puede contener decimales.*/
package classwork;

import java.util.Scanner;

public class ejercicioClase6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota1: ");
        int nota1 = sc.nextInt();

        System.out.print("Nota2: ");
        int nota2 = sc.nextInt();

        double media = (nota1 + nota2) / 2.0;

        System.out.println("Tu media es de: " + media);

        sc.close();
    }

}
