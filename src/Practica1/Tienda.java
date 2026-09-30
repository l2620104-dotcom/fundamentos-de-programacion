/*Nombre: Cristian Chavarria Alvarado
fecha: 29/09/2026
Proposito: Tiendita*/
package Practica1;
import java.util.Scanner;
public class Tienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double DESCUENTO_NORMAL = 0;
        final double DESCUENTO_FRECUENTE = 0.10;
        final double DESCUENTO_VIP = 0.20;
        final double DESCUENTO_ADICIONAL = 0.05;
        String nom;
        double monto, descuento, descuentoAdicional, total;
        int tipo;
        System.out.println("===== TIENDA =====");
        System.out.println("Escriba el nombre del cliente:");
        nom = sc.nextLine();
        System.out.println("Escriba el monto de la compra:");
        monto = sc.nextDouble();
        System.out.println("Escriba el tipo de cliente:");
        System.out.println("1.- Cliente normal");
        System.out.println("2.- Cliente frecuente");
        System.out.println("3.-Cliente VIP");
        tipo = sc.nextInt();
        descuento=0;
        if (tipo==1) {
            descuento = monto * DESCUENTO_NORMAL;
        } else if (tipo==2) {
            descuento = monto * DESCUENTO_FRECUENTE;
        } else if (tipo==3) {
            descuento = monto * DESCUENTO_VIP;
        }
        descuentoAdicional = 0;
        if (monto>2000) {
            descuentoAdicional = monto * DESCUENTO_ADICIONAL;
        }
        total = monto - descuento - descuentoAdicional;
        System.out.println("\n===== COMPRA =====");
        System.out.println("Cliente: " + nom);
        System.out.println("Monto original: $" + monto);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Descuento adicional: $" + descuentoAdicional);
        System.out.println("Total a pagar: $" + total);
    }
}