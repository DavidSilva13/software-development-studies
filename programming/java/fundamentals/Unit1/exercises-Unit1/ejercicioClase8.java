/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta
de manzanas y peras. Por este motivo, es necesario diseñar un programa que
solicite las ventas (en kilos)de cada semestre para cada fruta.
El programa mostrará el importe total sabiendo que el precio del kilo
de manzanas está fijado en 2,35 euros y el kilo de peras en 1,95 euros.*/
package classwork;

import java.util.Scanner;

public class ejercicioClase8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PRECIO_MANZANA = 2.35;
        final double PRECIO_PERA = 1.95;

        System.out.print("Manzanas primer semestre (Kg): ");
        double manzanas1 = sc.nextDouble();

        System.out.print("Manzanas segundo semestre (Kg): ");
        double manzanas2 = sc.nextDouble();

        System.out.print("Peras primer semestre (Kg): ");
        double peras1 = sc.nextDouble();

        System.out.print("Peras segundo semestre (Kg): ");
        double peras2 = sc.nextDouble();

        double beneficiosManzanas = (manzanas1 + manzanas2) * PRECIO_MANZANA;
        double beneficiosPeras = (peras1 + peras2) * PRECIO_PERA;

        System.out.println("Beneficio anual: " + (beneficiosManzanas + beneficiosPeras) + " euros");

        sc.close();

    }

}
