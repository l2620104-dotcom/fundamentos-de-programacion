import java.util.Scanner;
public class Restaurante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int UNO = 40;
        final int DOS = 60;
        final int TRES = 80;
        String nom;
        int op, piezas;
        double total = 0;
        double desc = 0;
        System.out.println("Escriba Su Nombre: ");
        nom = sc.nextLine();
        System.out.println("Escoja su opcion: 1.lavado 2.lavado y secado 3. lavado, secado y planchado");
        op = sc.nextInt();
        System.out.println("Escriba la cantidad de piezas: ");
        piezas = sc.nextInt();

        if (piezas<=0){
            System.out.println("Cantidad no disponible");

        } else if(op==1) {
            total = piezas * UNO;
        }else if (op==2){
            total = piezas * DOS;
        }else if (op==3){
            total = piezas * TRES;
        }


        if (total>500){
            desc = total * .05;
            total = total - desc;
        }
        if (piezas>10){
            desc = total * .10;
            total = total - desc;
        }

        System.out.println("===RECIVO===");
        System.out.println("NOMBRE: " + nom);
        System.out.println("TIPO DE SERVICIO: " + op);
        System.out.println("CANTIDAD DE PIEZAS: " + piezas);
        System.out.println("DESCEUNTO: " + desc);
        System.out.println("TOTAL A PAGAR: " + total);
        }
    }

