/*Nombre: Cristian Chavarria Alvarado
fecha: 23/09/26
Proposito: Registro de alumnos*/
import java.util.Scanner;
public class RegistroAlumno {
    public static void main(String[] args) {
        String Nombre, Apellido, Edad, Carrera, Semestre, Promedio;
        Scanner sc = new Scanner(System.in);
        final String ESCUELA = "TECNOLOGICO NACIONAL DE MÉXICO";
        System.out.println(ESCUELA);
        System.out.println("=====REGISTRO DE ESTUDIANTE======");
        System.out.println(" Escribe tu Nombre");
        Nombre = sc.nextLine(); //va a leer el resultado
        System.out.println(" Escribe tu Apellido");
        Apellido = sc.nextLine(); //va a leer el resultado
        System.out.println(" Escribe tu Edad");
        Edad = sc.nextLine(); //va a leer el resultado
        System.out.println(" Escribe tu Carrera");
        Carrera = sc.nextLine(); //va a leer el resultado
        System.out.println(" Escribe tu Semestre");
        Semestre = sc.nextLine(); //va a leer el resultado
        System.out.println(" Escribe tu Promedio");
        Promedio = sc.nextLine(); //va a leer el resultado
        System.out.println("===DATOS DE ALUMNO===");
        System.out.println(ESCUELA);
        System.out.println("Nombre: " + Nombre); //va a escribir el resultado
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + Edad);
        System.out.println("Carrera: " + Carrera);
        System.out.println("Semestre: " + Semestre);
        System.out.println("Promedio: " + Promedio);
    }
}
