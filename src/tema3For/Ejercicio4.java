package tema3For;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int resultado=1;
        System.out.println("Introduce un numero: ");
        numero = Integer.parseInt(sc.nextLine());

        for (int i=numero; i>0; i--){
            resultado *= i;
        }

        System.out.println("El factorial de " + numero + " es " + resultado);
        sc.close();
    }
}
