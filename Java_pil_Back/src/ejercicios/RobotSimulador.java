/*Desarrollar un programa Java controlado por menú de opciones, que permita
simular el desplazamiento de un robot sobre el plano.
• Inicialmente se genera la posición aleatoria del robot en forma de punto (x, y).
Luego se presenta un menú de opciones que permita los siguientes
movimientos:
        • Girar norte y avanzar 10 pasos
• Girar al sur y avanzar 20 pasos
• Girar al este y avanzar 10 pasos
• Girar al oeste y avanzar 20 pasos
• Salir   */

 package ejercicios;

 import java.util.Scanner;
 import java.util.Random;

public class RobotSimulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // generacion de posicion aleatoria para el robot
        int x = random.nextInt(101); // posicion entre el rango 0 a 100
        int y = random.nextInt();

        // mostrar la posicion inicial
        System.out.println("Posicion inicial del robot: (" + x + "," + y + ")" );

        boolean continuar = true;

        // menu de opciones
        while(continuar){
            System.out.println("\nSeleccione una opcion");
            System.out.println("1. Girar norte y avanzar diez pasos");
            System.out.println("2. Girar sur y avanzar veinte pasos");
            System.out.println("3. Girar este y avanzar diez pasos");
            System.out.println("4. Girar oeste y avanzar veinte pasos");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            switch (opcion){
                case 1: // girar norte y avanzar 10 pasos
                    y+=10;
                    System.out.println("El robot gira hacia el norte y avanza 10 pasos");
                    break;
                case 2: // girar sur y avanzar 20 pasos
                    y-=20;
                    System.out.println("El robot gira hacia el sur y avanza 20 pasos");
                    break;
                case 3: // girar este y avanzar 10 pasos
                    x+=10;
                    System.out.println("El robot gira hacia el este y avanza 10 pasos");
                    break;
                case 4: // girar oeste y avanzar 20 pasos
                    x-=20;
                    System.out.println("El robot gira hacia el oeste y avanza 20 pasos");
                    break;
                case 5: // salir
                    continuar = false;
                    System.out.println("¡El robot a finalizado la simulacion");
                    break;
                default:
                    System.out.println("Opcion invalida, intente nuevamente");
            }

                // mostrar la nueva posicion despues de cada movimiento
                if (continuar){
                    System.out.println("Posicion actual del robot:(" + x + "," + y + ")");
                }

        }

        scanner.close();


    }
}
