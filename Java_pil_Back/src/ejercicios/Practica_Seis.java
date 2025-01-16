/*Se pide desarrollar un programa que permita leer una serie de
números. La finalización de la carga de datos se presenta cuando el
usuario ingrese un número negativo. Los requerimientos funcionales
del programa son:
 Cantidad de valores pares e impares procesados
 Informar si al menos un cero fue procesado durante la carga
 Informar si la serie contiene solo números pares e impares
alternados*/

package ejercicios;
import java.util.Scanner;

public class Practica_Seis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // declaro contadores y variables
        int contPares = 0;
        int contImpares = 0;
        boolean contieneCero = false;
        boolean alternados = true;
        int previo = 0;
        boolean primero = true;

        while (true){
            System.out.println("Ingrese un numero(con negativo finaliza)");
            int numero = scanner.nextInt();

            if (numero < 0){
                break;
            }

            // contar numeros pares e impares
            if (numero % 2 == 0){
                contPares++;
            }else{
                contImpares++;
            }

            // verificar si contiene al menos un cero
            if (numero == 0){
                contieneCero = true;
            }

            // verificar si la serie es alternada
            if (!primero){
                if ((numero % 2 == 0 && previo % 2 == 0) || (numero % 2 != 0 && previo % 2 != 0)){
                    alternados = false;
                }
            }

            previo = numero;
            primero = false;


        }

        // mostrar los resultados

        System.out.println("Cantidad de numeros pares: " + contPares);
        System.out.println("Cantidad de numeros impares: " + contImpares);
        System.out.println("¿Se proceso al menos un cero?" + (contieneCero ? "Si" : "No" ));
        System.out.println("¿La serie contiene numeros pares e impares alternados?" + (alternados ? "Si" : "No"));


    }
}
