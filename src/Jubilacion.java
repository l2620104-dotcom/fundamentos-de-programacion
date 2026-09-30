
/*Nombre: Cristian Chavarria Alvarado
fecha: 23/09/26
Proposito: introduccion a programar*/
import java.util.Scanner;
public class Jubilacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int EDAD_JUBILACION=65;
        String nombre;
        int edad = 0;
        System.out.println("Escribe tu nombre: ");
        nombre = sc.nextLine(); //va a leer el resultado
        System.out.println("Escribe tu edad: ");
        edad = sc.nextInt();//cuando se ocupa int (en linea 8)

        //CONDICION SI
        if (edad>=EDAD_JUBILACION) { //variable si
            System.out.println(nombre + " tiene " + edad + " años y esta listo para jubilarse");//entonces
        } else if (edad>=EDAD_JUBILACION && edad<EDAD_JUBILACION){
            System.out.println(nombre + " es mayor de edad");
        }
        else{
            System.out.println(nombre + " tiene " + edad + " años y aun no se pude jubilar ");
            System.out.println( "Faltan: " +  (EDAD_JUBILACION-edad) + " años para jubilarse");
        }
    }//FINSI
}



