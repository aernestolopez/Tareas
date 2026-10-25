package tema3For;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int base, exponente,resultado=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base");
        base = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el exponente");
         exponente = Math.abs(Integer.parseInt(sc.nextLine()));

         for (int i = 0; i < exponente; i++){
             resultado *= base;
         }
         System.out.println("Resultado "+ resultado);
         sc.close();
    }
}
