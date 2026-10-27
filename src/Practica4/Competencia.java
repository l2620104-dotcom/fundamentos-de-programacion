package Practica4;
import java.util.Scanner;
public class Competencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int participantes, repetir, opcion;
        double distanciaTotal = 0;
        int bajo = 0, medio = 0, alto = 0;
        double distancia;
        double mayorDistancia = 0;
        int mejorParticipante = 0;
        double totalGeneral = 0;
        double sumaPromedios = 0;
        final int RONDAS = 5;
        do {
            System.out.println("Ingrese la cantidad de participantes:");
            participantes = sc.nextInt();
            while (participantes <= 0) {
                System.out.println("Error. Ingrese una cantidad mayor a cero:");
                participantes = sc.nextInt();
            }
            for (int p = 1; p <= participantes; p++) {
                System.out.println("\nParticipante " + p);
                for (int r = 1; r <= RONDAS; r++) {
                    System.out.println("Distancia recorrida en la ronda " + r + " (km):");
                    distancia = sc.nextDouble();
                    while (distancia < 0) {
                        System.out.println("Error. La distancia no puede ser negativa:");
                        distancia = sc.nextDouble();
                    }
                    distanciaTotal += distancia;
                    if (distancia < 2) {
                        System.out.println("Rendimiento bajo");
                        bajo++;
                    } else if (distancia <= 4) {
                        System.out.println("Rendimiento medio");
                        medio++;
                    } else {
                        System.out.println("Rendimiento alto");
                        alto++;
                    }
                }
                double promedio = distanciaTotal / RONDAS;
                System.out.println("\nDistancia total: " + distanciaTotal + " km");
                System.out.println("Promedio por ronda: " + promedio + " km");
                System.out.println("Rondas de rendimiento bajo: " + bajo);
                System.out.println("Rondas de rendimiento medio: " + medio);
                System.out.println("Rondas de rendimiento alto: " + alto);
                totalGeneral += distanciaTotal;
                sumaPromedios += promedio;
                if (p == 1 || distanciaTotal > mayorDistancia) {
                    mayorDistancia = distanciaTotal;
                    mejorParticipante = p;
                }
            }
            System.out.println("\n=== ESTADISTICAS GENERALES ===");
            System.out.println("1. Distancia total de todos los participantes");
            System.out.println("2. Promedio general por participante");
            System.out.println("3. Participante con mayor distancia acumulada");
            System.out.println("4. Mostrar todas las estadisticas");
            opcion = sc.nextInt();
            while (opcion < 1 || opcion > 4) {
                System.out.println("Opcion no valida. Elija del 1 al 4:");
                opcion = sc.nextInt();
            }
            switch (opcion) {
                case 1:
                    System.out.println("Distancia total general: " + totalGeneral + " km");
                    break;
                case 2:
                    System.out.println("Promedio general por participante: "
                            + (sumaPromedios / participantes) + " km");
                    break;
                case 3:
                    System.out.println("Participante con mayor distancia: "
                            + mejorParticipante);
                    System.out.println("Distancia acumulada: " + mayorDistancia + " km");
                    break;
                case 4:
                    System.out.println("Distancia total general: " + totalGeneral + " km");
                    System.out.println("Promedio general por participante: "
                            + (sumaPromedios / participantes) + " km");
                    System.out.println("Participante con mayor distancia: "
                            + mejorParticipante);
                    System.out.println("Distancia acumulada: " + mayorDistancia + " km");
                    break;
            }
            System.out.println("\nDesea registrar otra competencia?");
            System.out.println("1. Si");
            System.out.println("2. No");
            repetir = sc.nextInt();
            while (repetir < 1 || repetir > 2) {
                System.out.println("Opcion no valida. Escriba 1 o 2:");
                repetir = sc.nextInt();
            }
        } while (repetir == 1);
    }
}