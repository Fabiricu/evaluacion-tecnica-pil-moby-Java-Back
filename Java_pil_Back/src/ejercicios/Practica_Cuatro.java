
/*Desarrollar una clase ejecutable Practica05 que tome como dato de
entrada un número que corresponde a la longitud del radio una esfera
y, calcula y muestra el volumen de la esfera que se corresponden con
dicho radio. */


package ejercicios;

import java.util.Scanner;

public class Practica_Cuatro {

    public static double calcularVolumenEsfera(double radio){
        return  (4.0/3.0) * Math.PI * Math.pow(radio,3);
    }
    public static void main(String[] args) {


        // crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // solicitar al usuario el radio una esfera
        System.out.println("Ingresa el radio de una esfera");
        double radio = scanner.nextDouble();

        //double volumen = 4.0/3.0 * Math.PI * Math.pow(radio,3);
        double volumen = calcularVolumenEsfera(radio);

        System.out.println("El volumen de la esfera es: " + volumen);

        // cerrar el scanner
        scanner.close();



    }
}
