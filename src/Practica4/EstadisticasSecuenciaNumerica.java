package Practica4;
import java.util.Scanner;
public class EstadisticasSecuenciaNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
       do {
           int ent;
           int resp=0;
           int sumaCuatro = 0;
           int multiplosTres = 0;
           int ambos = 0;
           int pares = 0;
           int impares = 0;
           int multiplosCinco = 0;
           final int CUATRO = 4;
           final int TRES = 3;
           final int CINCO = 5;
           System.out.println("Escriba un numero entero positivo: ");
           ent = sc.nextInt();
           while (ent <= 0) {
               System.out.println("Debe ser mayor que 0");
               ent = sc.nextInt();
           }
           for (int i = 1; i <= ent; i++) {
               if (i % CUATRO == 0) {
                   sumaCuatro += i;
               }
               if (i % TRES == 0) {
                   multiplosTres++;
               }
               if (i % CUATRO == 0 && i % TRES == 0) {
                   ambos++;
               }
               if (i % 2 == 0) {
                   pares++;
               } else {
                   impares++;
               }
               if (i % 5 == 0) {
                   multiplosCinco++;
               }
           }
               System.out.println("===RESULTADOS===");
               System.out.println("SUMA DIVISIBLES ENTRE 4: " + sumaCuatro);
               System.out.println("NUMEROS MULTIPLOS DE 3: " + multiplosTres);
               System.out.println("NUMEROS DIVISIBLES ENTRE AMBOS: " + ambos);
               System.out.println("DESEA VISUALIZAR ESTADISTICAS DE NUMEROS PARES/IMPARES O MULTIMPLOS DE 5?");
               System.out.println("1)Numeros pares/impares");
               System.out.println("2)Numeros multiplos de 5");
               resp=sc.nextInt();
           switch (resp){
               case 1:
                   System.out.println("Los numeros pares/impares son: ");
                   System.out.println("Numeros pares: " + pares);
                   System.out.println("Los numros impares son: " + impares);
                   break;
               case 2:
                   System.out.println("Los numeros multiplos de 5 son: " + multiplosCinco);
                   break;
               default:
                   System.out.println("Opcion no valida");
           }
           System.out.println("Desea volver a repetir el proceso? 1)si 2)no");
           r=sc.nextInt();
       }while (r==1);
        }
    }

