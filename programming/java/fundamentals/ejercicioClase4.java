/*Escribir una aplicación que pida el año actual y el de nacimiento del usuario
Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años.
 */
package classwork;

import java.util.Scanner;

public class ejercicioClase4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el ano actual: ");
        int anoActual = sc.nextInt();

        System.out.print("Dime tu ano de nacimiento: ");
        int anoNacimiento = sc.nextInt();

        System.out.println("Tu edad es: " + (anoActual - anoNacimiento));

        sc.close();

    }

}
