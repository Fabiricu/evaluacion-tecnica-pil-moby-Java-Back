/*Se necesita averiguar el perímetro de un cuadrado, cuyo lado se conoce
como dato de entrada. */

package ejercicios;

import java.util.Scanner;

public class Practica_Uno {
    public static void main(String[] args) {
       // crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // solicitar al usuario los datos de entrada
        System.out.println("Ingresa el lado del cuadrado");
        int lado = scanner.nextInt();

        int perimetro = lado * lado;

        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
}
