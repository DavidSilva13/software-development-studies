/*Crea un programa en Java que pida dos números enteros por teclado y muestre su
suma por consola. Un ejemplo de salida sería:*/
package classwork;

import java.util.Scanner;

public class ejercicioClase1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero entero: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce el segundo numero entero: ");
        int numero2 = sc.nextInt();

        System.out.println("La suma es: " + (numero1 + numero2));

        sc.close();
    }

}
