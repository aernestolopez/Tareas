package tema3If;

import java.util.Map;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,x1, x2;

        System.out.println("Introduce el valor a");
        a = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce el valor b");
        b = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce el valor c");
        c = Double.parseDouble(sc.nextLine());

        if(a==0){
            System.out.println("No es válido");
        }
        else{
            double valorRaiz = Math.pow(b, 2) - 4*a*c;

            if(valorRaiz > 0){
                x1 = (-b + Math.sqrt(valorRaiz)) / (2*a);
                x2 = (-b - Math.sqrt(valorRaiz)) / (2*a);
                System.out.println("Soluciones \n 1. " + x1 + "\n 2. " + x2);
            } else if (valorRaiz == 0) {
                x1 = -b / (2*a);
                System.out.println("Solucion: " + x1);
            }
            else{
                System.out.println("Sin soluciones");
            }
        }
        sc.close();
    }
}
