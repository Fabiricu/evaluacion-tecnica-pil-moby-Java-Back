//Desarrollar un programa Java que genere por teclado 100 números
        //enteros y los guarde en un arreglo unidimensional. A continuación
        //calcula y muestra por separado la media de los valores positivos y la de
        //los valores negativos.




package ejercicios;
import java.util.Scanner;

public class MediaPositivosNegativos {
    public static void main(String[] args) {
        // crear el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // crear un arreglo para que almacene 100 numeros
        int [] numeros = new int[100];

        // Pedir al usuario que ingrese los 100 numeros
        System.out.println("Por favor, ingrese 100 numeros");

        // recorrer el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero" + (i+1)+ ":");
            numeros[i] = scanner.nextInt();
        }

        // variables para calcular las medias
        int sumaPos = 0;
        int sumaNeg = 0;
        int cantPos = 0;
        int cantNeg = 0;

        // recorrer el arreglo y separar positivos y negativos
        for (int num:  numeros){
            if (num > 0){
                sumaPos += num;
                cantPos++;
            } else if (num < 0) {
                sumaNeg += num;
                cantNeg++;
            }
        }

        // calcular y mostrar las medias
        if (cantPos > 0){
            double mediaPos = (double) sumaPos / cantPos;
            System.out.println("La media de los numeros positivos: " + mediaPos);
        }else {
            System.out.println("No se ingresaron numeros positivos");
        }

        if (cantNeg > 0){
            double mediaNeg = (double) sumaNeg / cantNeg;
            System.out.println("La media de los numeros negativos: " + mediaNeg);
        }else {
            System.out.println("no se ingresaron numeros negativos");
        }

        scanner.close();

    }
}
