/*Dado el siguiente polinomio de segundo grado:
𝑦 = 𝑎𝑥2 + 𝑏𝑥 + 𝑐 crea un programa que pida los coeficientes a, b y c, así como
el valor de x, y calcule el valor correspondiente de y. */
package classwork;

import java.util.Scanner;

public class ejercicio5FinalUnidad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        double aValor = sc.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double bValor = sc.nextDouble();

        System.out.print("Introduce el valor de c: ");
        double cValor = sc.nextDouble();

        System.out.print("Introduce el valor de x: ");
        double xValor = sc.nextDouble();

        double yValor = aValor * (xValor * xValor) + (bValor * xValor) + cValor;

        System.out.println("El valor de y es: " + yValor);

        sc.close();

    }

}
