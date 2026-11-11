/*Un biólogo está realizando un estudio de distintas especies de invertebrados y
necesita una aplicación que le ayude a contabilizar el número de patas que
tienen en total todos los animales capturados durante una jornada de trabajo.
Para ello, ha solicitado que escribas una aplicación a la que hay que proporcionar:
▪ El número de hormigas capturadas (6 patas).
▪ El número de arañas capturadas (8 patas).
▪ El número de cochinillas capturadas (14 patas).
La aplicación debe mostrar el número total de patas. */
package classwork;

import java.util.Scanner;

public class ejercicio8FinalUnidad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de hormigas capturadas (6 patas): ");
        int hormigas = sc.nextInt();

        System.out.print("Numero de aranas capturadas (8 patas): ");
        int aranas = sc.nextInt();

        System.out.print("Numero de cochinillas capturadas (14 patas): ");
        int cochinillas = sc.nextInt();

        int patasTotales = (hormigas * 6) + (aranas * 8) + (cochinillas * 14);

        System.out.println("El numero total de patas es de: " + patasTotales);

        sc.close();
    }

}
