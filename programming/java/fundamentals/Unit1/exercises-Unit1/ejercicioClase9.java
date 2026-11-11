/*Escribir un programa que pida un numero al usuario y muestre su valor en
absoluto.*/
package classwork;

import java.util.Scanner;

public class ejercicioClase9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numeroEntero = sc.nextInt();

        //int absoluto = numeroEntero >= 0 ? numeroEntero : -numeroEntero;
        int absoluto = Math.abs(numeroEntero);
        System.out.println("El valor absoluto es: " + absoluto);

        sc.close();

    }

}
