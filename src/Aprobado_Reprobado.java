/*Nombre: Cristian Chavarria Alvarado
fecha: 23/09/26
Proposito: introduccion a programar*/
import java.util.Scanner;
public class Aprobado_Reprobado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int CALIFICACION= 70;
        String Nombre;
        double Calificacion;
        System.out.println("Escribe tu nombre: ");
        Nombre = sc.nextLine();
        System.out.print("Escribe tu calificacion: ");
        Calificacion = sc.nextInt();

        //CONDICION SI
        if (Calificacion>=CALIFICACION) { //variable si
            System.out.println(Nombre + " aprobaste con " + Calificacion );//entonces
        }
        else{
            System.out.println(Nombre + " reprobaste con " + Calificacion );
        }
    }//FINSI
    }

