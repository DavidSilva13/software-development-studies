/*Una empresa que gestiona un parque acuático te solicita una aplicación
que les ayude a calcular el importe que hay que cobrar en la taquilla por
la compra de una serie de entradas (cuyo número será introducido por el usuario).
Existen dos tipos de entrada: infantiles, que cuestan 15,50 €, y de adultos,
que cuestan 20 €. En el caso de que el importe total sea igual o superior a 100 €,
se aplicará automáticamente un bono descuento del 5 %.*/
package classwork;

import java.util.Scanner;

public class ejercicio9FinalUnidad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PRECIO_ADULTOS = 20;
        final double PRECIO_INFANTILES = 15.5;

        System.out.print("Numero de entradas de adultos: ");
        int entradasAdultos = sc.nextInt();

        System.out.print("Numero de entradas infantiles: ");
        int entradasInfantiles = sc.nextInt();

        double precioTotal = (entradasAdultos * PRECIO_ADULTOS) + (entradasInfantiles * PRECIO_INFANTILES);

        double descuento = precioTotal * (5 / 100.0);
        double descuentoAnadido = precioTotal - descuento;

        double precioFinal = precioTotal >= 100.0 ? descuentoAnadido : precioTotal;

        System.out.println("El precio de las entradas son de: " + precioFinal + " euros");

        sc.close();

    }

}
