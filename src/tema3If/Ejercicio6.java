package tema3If;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double x;
        System.out.println("Introduce el valor a");
        a = Double.parseDouble(sc.nextLine());
        b = Double.parseDouble(sc.nextLine());


        if(a != 0){
            x = -b/a;
            System.out.println("El resultado es " + x);
        }
        else if (b != 0) {
            System.out.println("No se puede dividir entre 0");
        }
        else {
            System.out.println("Tiene infinitas soluciones");
        }
        sc.close();
    }
}
