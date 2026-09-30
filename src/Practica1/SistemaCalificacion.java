/*Nombre: Cristian Chavarria Alvarado
fecha: 29/09/2026
Proposito: Programa Sistema de calificaciones*/
package Practica1;
import java.util.Scanner;
public class SistemaCalificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MINIMO_APROBATORIO = 70;
        final int MINIMO_UNIDAD = 60;
        int cali1, cali2, cali3;
        int promedio;
        System.out.println(" CALIFICACIONES ");
        System.out.println("Ingrese la calificacion de la primer unidad: ");
        cali1 = sc.nextInt();
        System.out.println("Ingrese la calificacion de la segunda unidad: ");
        cali2 = sc.nextInt();
        System.out.println("Ingrese la calificacion de la tercer unidad: ");
        cali3 = sc.nextInt();
        promedio = (cali1 + cali2 + cali3) / 3;
        System.out.println("\n===== RESULTADOS =====");
        System.out.println("Calificacion unidad 1: " + cali1);
        System.out.println("Calificacion unidad 2: " + cali2);
        System.out.println("Calificacion unidad 3: " + cali3);
        System.out.println("Promedio: " + promedio);
        if (promedio >= MINIMO_APROBATORIO) {
            System.out.println("Alumno aprobado");
        } else {
            System.out.println("Alumno reprobado");
        }
        if (cali1 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperacion de la unidad 1");
        }
        if (cali2 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperacion de la unidad 2");
        }
        if (cali3 < MINIMO_UNIDAD) {
            System.out.println("Debe presentar recuperacion de la unidad 3");
        }
    }
}
