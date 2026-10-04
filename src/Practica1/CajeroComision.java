/*Nombre: Cristian Chavarria Alvarado
fecha: 30/09/2026
Proposito: Cajero Comision*/
package Practica1;
import java.util.Scanner;
public class CajeroComision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo, retiro1, retiro2;
        final int COMISION = 10;
        final int LIMITE_RETIRO = 5000;
        System.out.println("====CAJERO====");
        System.out.println("Por favor escriba el saldo disponible: ");
        saldo = sc.nextDouble();
        System.out.println("Escriba la cantidad que desea retirar: ");
        retiro1 = sc.nextDouble();
        if (retiro1 <= 0) {
            System.out.println("No se puede hacer un retiro igual o menor a $0");
        } else if (retiro1 > LIMITE_RETIRO) {
            System.out.println("No sobrepasar el limite ($5000)");
        } else if (retiro1 + COMISION > saldo) {
            System.out.println("No hay saldo suficiente");
        } else {
            retiro2 = saldo - retiro1 - COMISION;
            System.out.println("Su retiro ha sido hecho");
            System.out.println("Saldo inicial: " + saldo);
            System.out.println("Cantidad retirada: " + retiro1);
            System.out.println("Comision: " + COMISION);
            System.out.println("Saldo final: " + retiro2);
        }
    }
}