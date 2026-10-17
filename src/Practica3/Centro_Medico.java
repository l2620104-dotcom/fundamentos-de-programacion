package Practica3;
import java.util.Scanner;
public class Centro_Medico {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int edad;
        double costo, descuento = 0.0;
        int contanino = 0;
        int conta_adoles = 0;
        int conta_adulto = 0;
        int contamayor = 0;
        int res;
        int totalgeneral=0;
        int pagonino=0;
        int pagoadolescente=0;
        int pagoadulto=0;
        int adultomayor=0;
        int totaldepacientes=0;
        do {
            System.out.println("Edad del paciente: ");
            edad = scanner.nextInt();

            if (edad <= 12) {
                System.out.println("Usted se clasifica como niño");
                System.out.println("Ingrese el costo de la consulta:");
                pagonino= scanner.nextInt();;
                contanino++;
            }
            if (edad > 12 && edad <= 17) {
                System.out.println("Usted se clasifica como adolecente");
                System.out.println("Ingrese el costo de la consulta");
                pagoadolescente=scanner.nextInt();
                conta_adoles++;

            }
            if (edad >= 18 && edad <= 59) {
                System.out.println("Usted se clasifica como un adulto");
                System.out.println("Ingrese el costo de la consulta");
                pagoadulto= scanner.nextInt();
                conta_adulto++;
            }
            if (edad >= 60) {
                System.out.println("Usted se clasifica como adulto mayor");
                System.out.println("Ingrese el costo de la consulta");
                adultomayor= scanner.nextInt();
                System.out.println("Se le aplicara un descuento:" + (adultomayor * 0.15));
                contamayor++;
            }
            System.out.println("¿Hay mas pasientes por registrar? 1)si 2)no" );
            res= scanner.nextInt();
            totalgeneral=(pagonino+pagoadolescente+pagoadulto+adultomayor);
            totaldepacientes=(contanino+conta_adoles+conta_adulto+contamayor);
        }while(res==1);
        System.out.println("===RESUMEN===");
        System.out.println("Total recaudado:"+totalgeneral);
        System.out.println("Cantidad de Niños:"+contanino);
        System.out.println("Pago Recaudado por NIños:"+pagonino);
        System.out.println("Cantidad de Adolescentes:"+conta_adoles);
        System.out.println("Pago recaudado por Adolescentes:"+pagoadolescente);
        System.out.println("Cantidad de Adultos:"+conta_adulto);
        System.out.println("Pago recaudado por Adultos:"+pagoadulto);
        System.out.println("Cantidad de Adultos Mayores:"+contamayor);
        System.out.println("Pago recaudado por Adultos mayores: "+adultomayor);
        System.out.println("Promedio pagado por paciente:"+(totalgeneral/totaldepacientes));
    }
}