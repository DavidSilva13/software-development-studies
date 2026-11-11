/*Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. La
aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos
introducidos por el usuario.*/
package classwork;

import java.util.Scanner;

public class ejercicio6FinalUnidad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cantidad de segundos: ");
        int segundosEntregados = sc.nextInt();

        int horas = segundosEntregados / 3600;
        int minutos = (segundosEntregados % 3600) / 60;
        int segundos = segundosEntregados % 60;

        System.out.println("En tu cantidad de segundos hay: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos. ");

        sc.close();

    }

}
