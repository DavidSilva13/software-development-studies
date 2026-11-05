/*El tipo short permite almacenar valores comprendidos entre -32768 y 32767. Escribir un
programa que compruebe que el rango de valores de un tipo se comporta de forma
cíclica, es decir, el valor siguiente al máximo es el valor mínimo.*/
package classwork;

public class ejercicioClase5 {

    public static void main(String[] args) {

        short numero = 32767;

        numero++;

        System.out.println("Cuando sumamos 1: " + numero);

        short minimo = -32768;

        minimo--;

        System.out.println("Cuando restamos 1: " + minimo);

    }

}
