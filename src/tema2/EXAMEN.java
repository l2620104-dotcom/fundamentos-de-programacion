import java.util.Scanner;
public class EXAMEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nom;
        double peso;
        double total = 0;
        int cargo = 0;
        final int PESO_MAXIMO = 30;
        final int CARGO_LIGERO = 150;
        final int CARGO_MEDIO = 300;
        final int CARGO_PESADO = 500;

        System.out.println("Escriba el nombre del pasajero: ");
        nom = sc.nextLine();
        System.out.println("Escriba el peso del equipaje: ");
        peso = sc.nextDouble();

        if (peso <= 15) {
            System.out.println("NO HAY CARGO ADICIONAL");
        } else if (peso>=15 && peso<20){
            System.out.println("El cargo es ligero, se le añadira un costo adicional de: " + CARGO_LIGERO);
            cargo = CARGO_LIGERO;
        } else if (peso>20 && peso<30){
            System.out.println("El cargo es medio, se le añadira un costo adicional de: " + CARGO_MEDIO);
            cargo = CARGO_MEDIO;
        }else if (peso>=30){
            System.out.println("El cargo es pesado, se le añadira un costo adicional de: " + CARGO_PESADO);
            System.out.println("Limite de peso axcesible");
            cargo = CARGO_PESADO;
        }
            System.out.println("===EQUIPAJE===");
            System.out.println("NOMBRE: " + nom);
            System.out.println("Peso del equipaje: " + peso);
            System.out.println("Cargo: " + cargo);

        }
    }


