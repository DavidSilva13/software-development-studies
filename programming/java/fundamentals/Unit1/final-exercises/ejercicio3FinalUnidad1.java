/*Modifica la Actividad 2 para que, indicando dos números n y m, diga qué cantidad hay que
sumarle a n para que sea múltiplo de m*/
package classwork;

import java.util.Scanner;

public class ejercicio3FinalUnidad1 {

    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Escribe un numero (n): ");
        int numeroN = sc.nextInt();
        
        System.out.print("Escribe un numero (m): ");
        int numeroM = sc.nextInt();
        
        boolean multiploM = numeroN % numeroM == 0.0;
        
        System.out.println("Es multiplo de m?: " + multiploM);
        
        int cantidad = numeroM - (numeroN % numeroM);
        
        System.out.println("Para que sea multiplo de m hay que sumar: " + cantidad);
        
        sc.close();
        
        
    }
    
}
