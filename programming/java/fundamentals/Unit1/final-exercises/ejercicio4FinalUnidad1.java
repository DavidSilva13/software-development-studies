/*Crea un programa que pida la base y la altura de un triángulo y muestre su área.
Area triangulo = base × altura /2 */
package classwork;

import java.util.Scanner;

public class ejercicio4FinalUnidad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base del triangulo: ");
        double base = sc.nextDouble();

        System.out.print("Introduce la altura del triangulo: ");
        double altura = sc.nextDouble();

        double area = (base * altura) / 2.0;

        System.out.println("El area del triangulo es: " + area);

        sc.close();

    }

}
