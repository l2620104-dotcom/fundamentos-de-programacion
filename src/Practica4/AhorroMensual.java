
package Practica4;
import java.util.Scanner;
public class AhorroMensual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repetir;
        do {
            double dinero;
            double meta;
            double ahorro;
            double saldo;
            double saldoIntereses = 0;
            int meses = 0;
            int plazo;
            boolean alcanzada;
            System.out.println("Escriba una cantidad inicial $:");
            dinero = sc.nextDouble();
            while (dinero <= 0) {
                System.out.println("Cantidad no valida. Ingrese un monto mayor a $0:");
                dinero = sc.nextDouble();
            }
            System.out.println("Meta de ahorro:");
            meta = sc.nextDouble();
            while (meta <= 0) {
                System.out.println("Cantidad no valida. Ingrese una meta mayor a $0:");
                meta = sc.nextDouble();
            }
            System.out.println("Ahorro mensual fijo:");
            ahorro = sc.nextDouble();
            while (ahorro <= 0) {
                System.out.println("Cantidad no valida. Ingrese un ahorro mayor a $0:");
                ahorro = sc.nextDouble();
            }
            System.out.println("Seleccione el plazo:");
            System.out.println("1. 6 meses");
            System.out.println("2. 12 meses");
            System.out.println("3. 24 meses");
            plazo = sc.nextInt();
            while (plazo < 1 || plazo > 3) {
                System.out.println("Opcion no valida. Elija 1, 2 o 3:");
                plazo = sc.nextInt();
            }
            switch (plazo) {
                case 1:
                    plazo = 6;
                    break;
                case 2:
                    plazo = 12;
                    break;
                case 3:
                    plazo = 24;
                    break;
            }
            saldo = dinero;
            for (int i = 1; i <= plazo; i++) {
                double interesMes = saldo * 0.01;
                saldoIntereses += interesMes;
                saldo += interesMes;
                saldo += ahorro;
                if (saldo >= meta && meses == 0) {
                    meses = i;
                }
            }
            if (saldo >= meta) {
                alcanzada = true;
            } else {
                alcanzada = false;
            }
            System.out.println("\n=== RESULTADOS ===");
            System.out.println("Saldo final: $" + saldo);
            System.out.println("Intereses generados: $" + saldoIntereses);
            if (alcanzada) {
                System.out.println("Meta alcanzada.");
                System.out.println("Meses necesarios: " + meses);
            } else {
                System.out.println("No se alcanzo la meta en el plazo seleccionado.");
            }
            System.out.println("\nDesea realizar otra simulacion?");
            System.out.println("1. Si");
            System.out.println("2. No");
            repetir = sc.nextInt();
        } while (repetir == 1);
    }
}
