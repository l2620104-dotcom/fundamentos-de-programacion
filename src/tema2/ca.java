/*Nombre: Cristian Chavarria Alvarado
fecha: 25/09/26
Proposito: introduccion a programar*/
import java.util.Scanner;
public class Calificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Nombre;
        int Cali;
        System.out.println("Escribe tu nombre: ");
        Nombre = sc.nextLine();
        System.out.println("Escribe tu calificacion: ");
        Cali = sc.nextInt();
        if (Cali >= 90) {
            System.out.println(Nombre + " Excelente");
        } else if (Cali >= 80) {
            System.out.println(Nombre + " Muy bien");
        } else if (Cali >= 70) {
            System.out.println(Nombre + " Bien");
        } else if (Cali >= 60) {
            System.out.println(Nombre + " Suficiente");
        } else if (Cali >= 0) {
            System.out.println(Nombre + " Reprobado");
        }
    }
}