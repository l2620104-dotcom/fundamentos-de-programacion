/*Nombre: Cristian Chavarria Alvarado
fecha: 29/09/2026
Proposito: Programa de un cajero automatico*/
package Practica1;
import java.util.Scanner;
public class CajeroAtomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int LIMITE_RETIRO = 5000;
        int saldo1, saldo2, saldoActual;
        System.out.println("==== CAJERO AUTOMATICO ====");
        System.out.println("Saldo disponible:");
        saldo1 = sc.nextInt();
        System.out.println("Escriba la cantidad que desea retirar:");
        saldo2 = sc.nextInt();
        if (saldo2 <= 0) {
            System.out.println("La cantidad a retirar tiene que ser mayor que $0");
        } else if (saldo2 > LIMITE_RETIRO) {
            System.out.println("Lo sentimos, no puede retirar más del límite establecido ($5000)");
        } else if (saldo1 < saldo2) {
            System.out.println("No hay saldo suficiente, inténtelo de nuevo");
        } else {
            saldoActual = saldo1 - saldo2;
            System.out.println("El retiro ha sido un éxito.");
            System.out.println("Saldo retirado: $" + saldo2);
            System.out.println("Saldo actual: $" + saldoActual);
            if (saldoActual < 500) {
                System.out.println("AVISO: Su saldo actual es de $" + saldoActual);
            }
        }
    }
}