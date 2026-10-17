package Practica3;
import java.util.Scanner;
public class Gasolinera {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int litros;
        double precio;
        double importe;
        double descuentoActual;
        int contador_cargas = 0;
        int acumulador_litros = 0;
        double total_cobrado = 0;
        int contador_con_descuento = 0;
        double total_descuentos = 0;
        int res;
        do {
            System.out.println("Ingrese los litros cargados: ");
            litros = scanner.nextInt();
            System.out.println("Ingrese el precio por litro: ");
            precio = scanner.nextDouble();
            if (litros <= 0 || precio <= 0) {
                System.out.println("Valor invalido, carga no registrada");
            } else {
                contador_cargas++;
                acumulador_litros += litros;
                importe = litros * precio;
                descuentoActual = 0;
                if (litros >= 40) {
                    descuentoActual = importe * 0.05;
                    contador_con_descuento++;
                    total_descuentos += descuentoActual;
                }
                total_cobrado += (importe - descuentoActual);
                System.out.println("Importe de esta carga: " + importe + "Descuento: " + descuentoActual);
            }
            System.out.println("Se registraran mas cargas?\n1)si\n2)no");
            res = scanner.nextInt();
        } while (res == 1);
        System.out.println("=== RESUMEN ===");
        System.out.println("Contador de cargas: " + contador_cargas);
        System.out.println("Acumulador de litros: " + acumulador_litros);
        System.out.println("Total de descuentos otorgados: " + total_descuentos);
        System.out.println("Total cobrado (ya con descuento): " + total_cobrado);
        System.out.println("Cargas que recibieron descuento: " + contador_con_descuento);
        if (contador_cargas > 0) {
            System.out.println("Importe promedio por pagar: " + (total_cobrado / contador_cargas));
        }
    }
}