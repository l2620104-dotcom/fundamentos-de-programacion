package Practica4;
import java.util.Scanner;
public class NumerosAmigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MINIMO = 1;
        int n1, n2;
        int suma1 = 0, suma2 = 0;
        int contador1 = 0, contador2 = 0;
        int opcion, repetir;
        do {
            suma1 = 0;
            suma2 = 0;
            contador1 = 0;
            contador2 = 0;
            System.out.println("Escribe el primer numero entero positivo:");
            n1 = sc.nextInt();
            while (n1 < MINIMO) {
                System.out.println("El numero tiene que ser entero positivo:");
                n1 = sc.nextInt();
            }
            System.out.println("Escribe el segundo numero entero positivo:");
            n2 = sc.nextInt();
            while (n2 < MINIMO) {
                System.out.println("El numero tiene que ser entero positivo:");
                n2 = sc.nextInt();
            }
            for (int i = 1; i < n1; i++) {
                if (n1 % i == 0) {
                    suma1 += i;
                    contador1++;
                }
            }
            for (int i = 1; i < n2; i++) {
                if (n2 % i == 0) {
                    suma2 += i;
                    contador2++;
                }
            }
            System.out.println("\nElige una opcion:");
            System.out.println("1. Mostrar las sumas de los divisores");
            System.out.println("2. Mostrar solo el resultado");
            opcion = sc.nextInt();

            while (opcion < 1 || opcion > 2) {
                System.out.println("Opcion no valida. Elige 1 o 2:");
                opcion = sc.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("Suma de divisores de " + n1 + ": " + suma1);
                    System.out.println("Suma de divisores de " + n2 + ": " + suma2);
                    System.out.println("Cantidad de divisores de " + n1 + ": " + contador1);
                    System.out.println("Cantidad de divisores de " + n2 + ": " + contador2);
                    if (suma1 == n2 && suma2 == n1) {
                        System.out.println("Son numeros amigos.");
                    } else {
                        System.out.println("No son numeros amigos.");
                    }
                    break;
                case 2:
                    if (suma1 == n2 && suma2 == n1) {
                        System.out.println("Son numeros amigos.");
                    } else {
                        System.out.println("No son numeros amigos.");
                    }
                    break;
            }
            System.out.println("\nDeseas analizar otra pareja?");
            System.out.println("1. Si");
            System.out.println("2. No");
            repetir = sc.nextInt();
        } while (repetir == 1);
    }
}
