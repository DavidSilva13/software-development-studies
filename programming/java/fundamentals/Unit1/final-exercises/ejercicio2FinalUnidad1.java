/*Escribe un programa que tome como entrada un número entero e indique qué cantidad
hay que sumarle para que el resultado sea múltiplo de 7.
Un ejemplo:
▪ A 2 hay que sumarle 5 para que el resultado (2 + 5 = 7) sea múltiplo de 7.
▪ A 13 hay que sumarle 1 para que el resultado (13 + 1 = 14) sea múltiplo de 7.
Si proporcionas el número 2 o el 13, la salida de la aplicación debe ser 5 o 1,
respectivamente.*/
package classwork;

import java.util.Scanner;

public class ejercicio2FinalUnidad1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba un numero entero: ");
        int numeroEntero = sc.nextInt();
        
        boolean estado = numeroEntero % 7 == 0.0 ? true : false;
        
        System.out.println("Es multiplo de 7?: " + estado);
        
        int cantidad = 7 - (numeroEntero % 7);
        
        System.out.println("Para que sea multiplo de 7 hay que sumarle: " + cantidad);
        
        sc.close();

    }

}
