/*Una persona necesita obtener información relacionada con el
desempeño de su automóvil. Se pide generar las siguientes salidas
impresas:
• La cantidad de litros consumidos.
• El importe gastado en combustible
Para ello Ud. dispone de las siguientes entradas:
        • Kilómetros (km): representa los Km recorridos por el vehículo.
        • Precio (pr): representa el precio de combustible por litro.
        • Kilómetros Litro (kmL): representa los km recorridos por cada
          litro. */


package ejercicios;

import java.util.Scanner;

public class Practica_Dos {
    public static void main(String[] args) {
        // crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // solicitar al usuario los datos de entrada Km
        System.out.println("Ingresa la cantidad de Km recorridos");
        double km = scanner.nextDouble();

        System.out.println("Ingresa el precio de combustible por litro");
        double precio = scanner.nextDouble();

        System.out.println("Ingresa los Km recorridos por cada litro");
        double km_litro = scanner.nextDouble();

        // calcular La cantidad de litros consumidos
        double litrosConsumidos = km / km_litro;

        // calcular el importe gastado en combustible
        double importeGastado = litrosConsumidos * precio;

        // imprimir los resultados
        System.out.println("\nResultado");
        System.out.println("Cantidad de litros consumidos:" + litrosConsumidos + "litros");
        System.out.println("Importe gastado en combustible:$" + importeGastado);

        // cerrar el scanner
        scanner.close();

    }
}
