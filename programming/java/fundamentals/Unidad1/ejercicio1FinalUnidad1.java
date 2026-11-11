/*Un economista te ha encargado un programa para realizar cálculos con el IVA.
La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
Muestra en pantalla el importe correspondiente al IVA y al total.*/
package classwork;

import java.util.Scanner;

public class ejercicio1FinalUnidad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Base imponible: ");
        double precio = sc.nextDouble();

        System.out.print("IVA a anadir: ");
        int ivaInicial = sc.nextInt();

        double ImporteIva = precio * (ivaInicial / 100.0);
        double precioTotal = precio + ImporteIva;

        System.out.println("Importe correspondiente al IVA: " + ImporteIva);
        System.out.println("Precio total: " + precioTotal);

        sc.close();

    }

}
