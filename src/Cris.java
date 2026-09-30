import java.util.Scanner; //libreria de Scanner

/*Nombre: Cristian Chavarria Alvarado
fecha: 23/09/26
Proposito: introduccion a programar*/

public class Cris { //lo que va al inicio


    public static void main(String[] args) { //Siempre se pone esto
        String nombre;
        final String SALUDO = "HOLA, "; //crea una constante
        Scanner sc = new Scanner(System.in); //escanea lo que se escribe

        System.out.println("HOLA MUNDO :)"); //Para escribir directamente
        System.out.printf(" Soy Cristian Chavarria,"); //se escribe sout y seleccionar

        System.out.println(" Escribe tu nombre");
        nombre = sc.nextLine(); //va a leer el resultado
        System.out.println(SALUDO + nombre); //va a escribir el resultado


    }

}
