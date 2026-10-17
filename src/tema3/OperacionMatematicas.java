package tema3;

import java.util.Scanner;

public class OperacionMatematicas {
    static void main() {
        int op,a,b;
        Scanner scsnner = new Scanner(System.in);
        System.out.println("1)SUMA \n 2)RESTA \n 3)MULTIPLICACION \n 4)DIVISION");
        op = scsnner.nextInt();
        System.out.println("INGRESA VALOR DE A");
        a = scsnner.nextInt();
        System.out.println("INGRESA VALOR DE B");
        b = scsnner.nextInt();
        switch (op){
            case 1:
                System.out.println("RESULTADO " + (a+b));
                break;
            case 2:
                System.out.println("RESULTADO " + (a-b));
                break;
            case 3:
                System.out.println("RESULTADO " + (a*b));
                break;
            case 4:
                if(b!=0){
                    System.out.println("RESULTADO: " + (a/b));
                }else{
                    System.out.println("VALOR NO VALIDO");
                }
                break;


        }
    }
}