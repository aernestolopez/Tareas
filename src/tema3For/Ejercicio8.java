package tema3For;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numero, contador=0;
        Scanner sc = new Scanner(System.in);
        int suma=0;
        double media=0;

        for (; suma <10000;){
            System.out.println("Introduce un numero");
            numero = Integer.parseInt(sc.nextLine());
            suma += numero;
            contador++;
        }

        if (contador >0){
            media= (double) suma /contador;
        }
        System.out.println("Total acumulado: " + suma);
        System.out.println("Total de números introducidos: " + contador);
        System.out.println("Media de los números: " + media);
        sc.close();
    }

}
