/*Crear un programa en Java que nos indique si podemos salir a la calle. Existen
aspectos que influirán en esta decisión: si está lloviendo y si hemos terminado
nuestras tareas. Solo podremos salir a la calle si no está lloviendo y hemos
finalizado nuestras tareas. Existe una opción en la qué, indistintamente de lo
anterior, podremos salir a la calle: el hecho de que tengamos que ir a la
biblioteca. Solicitar al usuario (mediante un booleano) si llueve, si ha
finalizado las tareas y si necesita ir a la biblioteca.
El algoritmo debe mostrar mediante un booleano si es posible que se le otorgue
permiso para salir a la calle.*/
package classwork;

import java.util.Scanner;

public class ejercicioClase7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Esta lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();

        System.out.print("¿Has terminado la tarea? (true/false): ");
        boolean tarea = sc.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean necesidad = sc.nextBoolean();

        boolean puedeSalir = (!llueve && tarea) || necesidad;
        System.out.println("Permiso para salir: " + puedeSalir);

        sc.close();

    }

}
