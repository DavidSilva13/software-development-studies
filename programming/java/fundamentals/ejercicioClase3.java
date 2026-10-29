
package classwork;

import java.util.Scanner;
/*Pedir al usuario edad y mostrar la que tendrá el próximo año*/
public class ejercicioClase3 {

   
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();
        
        edad++;
        
        System.out.println("Tu edad el proximo ano es: " + edad);
        
        sc.close();
        
        
    }
    
}

