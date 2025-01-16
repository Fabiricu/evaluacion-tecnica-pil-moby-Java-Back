/*Desarrollar una clase ejecutable Practica06 que calcule el área de un
triángulo en función de las longitudes de sus lados (a, b, c), según la
siguiente fórmula:

Area = RaizCuadrada(sp*(p-a)*(p-b)*(p-c))
donde sp = (a+b+c)/2 (Semi-perímetro)  */


package ejercicios;
import java.util.Scanner;

public class Practica_Cinco {

    public static double CalcularAreaTriangulo(double  a, double  b, double  c){
        // calcular el semiperimetro(sp)
        double sp = (a + b + c) / 2;

        // aplicar la formula de Heron
        double area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        return area;

    }
    public static void main(String[] args) {
        // crear un objeto scanner para leer datos desde entrada o teclado
        Scanner scanner = new Scanner(System.in);

        // solicitar al usuario las longitudes de los lados del triangulo
        System.out.println("Introduce la longitud del lado a");
        double a = scanner.nextDouble();

        System.out.println("Introduce la longitud del lado b");
        double b = scanner.nextDouble();

        System.out.println("Introduce la longitud del lado c");
        double c = scanner.nextDouble();

        // verificar si los valores forman un triangulo valido
        if (esTrianguloValido(a,b,c)){
            // calcular el area utilizando la formula de heron
            double area = CalcularAreaTriangulo(a,b,c);

            // Mostrar el área con 2 decimales
            System.out.printf("El área del triángulo con lados %.2f, %.2f y %.2f es: %.2f\n", a, b, c, area);
        } else {
            System.out.println("Los valores proporcionados no forman un triángulo válido.");
        }

        scanner.close();
        }

        // Metodo para verificar si los lados forman un triangulo valido
        public static boolean esTrianguloValido(double a, double b, double c){
            return a + b > c && a + c > b && b + c > a;
        }


    }
}
