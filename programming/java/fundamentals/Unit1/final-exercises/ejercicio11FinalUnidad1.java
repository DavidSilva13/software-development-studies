/* Pide dos números al usuario: a y b. Deberá mostrarse true si ambos números
son iguales y false en caso contrario.*/
package classwork;

import java.util.Scanner;

public class ejercicio11FinalUnidad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el numero a: ");
        double a = sc.nextDouble();

        System.out.print("Dime el numero b: ");
        double b = sc.nextDouble();

        boolean estado = a == b ? true : false;

        System.out.println(estado);

        sc.close();

    }

}
