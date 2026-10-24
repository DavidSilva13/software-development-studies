
package classwork;

import java.util.Scanner;

public class ejercicioClase2 {

    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el nombre del jugador: ");
        String nombre = sc.next();
        
        System.out.print("Introduce los puntos de la primera partida: ");
        int puntos1 = sc.nextInt();
        
        System.out.print("Introduce los puntos de la segunda partida: ");
        int puntos2 = sc.nextInt();
        
        System.out.println( nombre + " ha conseguido un total de " + (puntos1 + puntos2) + " puntos. ");
        
        sc.close();
    }
    
}
