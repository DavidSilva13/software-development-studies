/* Solicita al usuario tres distancias:
▪ La primera, medida en milímetros.
▪ La segunda, medida en centímetros.
▪ La última, medida en metros.
Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en
centímetros).*/
package classwork;

import java.util.Scanner;

public class ejercicio7FinalUnidad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la primera medida (mm): ");
        double medida1 = sc.nextDouble();

        System.out.print("Dime la segunda medida (cm): ");
        double medida2 = sc.nextDouble();

        System.out.print("Dime la tercera medida (m): ");
        double medida3 = sc.nextDouble();

        double medidaTotal = (medida1 / 10) + medida2 + (medida3 * 100);

        System.out.println("La suma de las tres longitudes en cm es de: " + medidaTotal);

        sc.close();

    }

}
