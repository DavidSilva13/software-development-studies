/* La FILA (Federación Internacional de Lanzamiento de Algoritmo) 
realiza una competición donde cada participante escribe un algoritmo en un papel
y lo lanza, ganando quien consiga lanzarlo más lejos.
La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros 
(con tantos decimales como se desee), pero para el ranking solo se tiene
en cuenta la longitud en centímetros (sin decimales).
Por ejemplo, para un lanzamiento de 12,3456 m (que son 1234,56 cm) solo se
contabilizarán 1234 cm.
Realiza un programa que solicite la longitud (en metros) de un lanzamiento y 
muestre la parte entera correspondiente en centímetros.*/
package classwork;

import java.util.Scanner;

public class ejercicio12FinalUnidad1 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Longitud (m): ");
        double metros = sc.nextDouble();
        
        double centimetros = metros * 100;
        
        double medidaFinal = centimetros;
        
        int medidaEntera = (int)medidaFinal;
        
        System.out.println("La longitud en cm es de: " + medidaEntera);
        
        sc.close();
    
    }
    
}
