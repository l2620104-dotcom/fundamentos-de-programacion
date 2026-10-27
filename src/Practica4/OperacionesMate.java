package Practica4;
import java.util.Scanner;
public class OperacionesMate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int num;
        do {
            System.out.println("\n=== MENU DE OPERACIONES ===");
            System.out.println("1. Calcular el cuadrado");
            System.out.println("2. Calcular el cubo");
            System.out.println("3. Determinar si es par o impar");
            System.out.println("4. Sumar los numeros desde 1");
            System.out.println("5. Salir");
            System.out.println("Elige una opcion:");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa un numero positivo:");
                    num = sc.nextInt();

                    if (num > 0) {
                        System.out.println("El cuadrado es: " + (num * num));
                    } else {
                        System.out.println("Error. El numero debe ser positivo.");
                    }
                    break;
                case 2:
                    System.out.println("Ingresa un numero positivo:");
                    num = sc.nextInt();
                    if (num > 0) {
                        System.out.println("El cubo es: " + (num * num * num));
                    } else {
                        System.out.println("Error. El numero debe ser positivo.");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa un numero entero:");
                    num = sc.nextInt();
                    if (num % 2 == 0) {
                        System.out.println("El numero es par.");
                    } else {
                        System.out.println("El numero es impar.");
                    }
                    break;
                case 4:
                    System.out.println("Ingresa un numero positivo:");
                    num = sc.nextInt();
                    if (num > 0) {
                        int suma = 0;

                        for (int i = 1; i <= num; i++) {
                            suma += i;
                        }
                        System.out.println("La suma es: " + suma);
                    } else {
                        System.out.println("Error. El numero debe ser positivo.");
                    }
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa. Adios.");
                    break;

                default:
                    System.out.println("Error. La opcion no existe.");
                    break;
            }
        } while (opcion != 5);
    }
}
