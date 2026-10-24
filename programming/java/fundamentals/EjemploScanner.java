
package classwork;

import java.util.Scanner;

public class EjemploScanner {

    
    public static void main(String[] args) {
        /*System.out.print("hola ");
        System.out.println("clase");
        System.out.println("!");
        System.out.println("Empezamos con Java");*/
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        
        sc.nextLine();
        
        
        
        
        
        System.out.print("Introduce tu nombre completo: ");
        String nombre = sc.nextLine();
        System.out.print("Hola, " + nombre + ',');
        System.out.println(" tienes: " + edad + " anios");
    }
    
}
