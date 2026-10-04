/*Nombre: Cristian Chavarria Alvarado
fecha: 29/09/2026
Proposito: Cobro de estacionamiento*/
package Practica1;
import java.util.Scanner;
public class CobroEstacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MOTO = 1;
        final int AUTO = 2;
        final int CAMION = 3;
        final int TARIFA_MOTO = 10;
        final int TARIFA_AUTO = 20;
        final int TARIFA_CAMION = 30;
        final double DESC_10 = 0.10;
        final double DESC_20 = 0.20;
        int tipo, horas;
        int tarifa = 0;
        String nombreVehiculo = "";
        double subtotal = 0, descuento = 0, totalPagar = 0;
        System.out.println("===ESTACIONAMIENTO===");
        System.out.println("Ingrese el tipo de vehiculo (1=Moto, 2=Auto, 3=Camion):");
        tipo = sc.nextInt();
        System.out.println("Ingrese el numero de horas:");
        horas = sc.nextInt();
        if (horas <= 0) {
            System.out.println("La cantidad de horas no es valida");
            return; // termina aquí
        }
        if (tipo == MOTO) {
            tarifa = TARIFA_MOTO;
            nombreVehiculo = "Motocicleta";
        } else if (tipo == AUTO) {
            tarifa = TARIFA_AUTO;
            nombreVehiculo = "Automovil";
        } else if (tipo == CAMION) {
            tarifa = TARIFA_CAMION;
            nombreVehiculo = "Camioneta";
        } else {
            System.out.println("Tipo de vehiculo no valido");
            return;
        }
        subtotal = horas * tarifa;
        if (horas > 10) {
            descuento = subtotal * DESC_20;
        } else if (horas > 5) {
            descuento = subtotal * DESC_10;
        } else {
            descuento = 0;
        }
        totalPagar = subtotal - descuento;
        System.out.println("--- TICKET ---");
        System.out.println("Tipo de vehiculo: " + nombreVehiculo + " (" + tipo + ")");
        System.out.println("Horas: " + horas);
        System.out.println("Tarifa por hora: $" + tarifa);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);
    }
}