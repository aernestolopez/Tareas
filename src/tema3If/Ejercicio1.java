package tema3If;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta;
        System.out.println("Introduce la capital de Tovalu");
        respuesta = sc.nextLine();

        if(respuesta.equalsIgnoreCase("Funafuti")){
            System.out.println("Has acertado");
        }else{
            System.out.println("No es correcto");
        }
        sc.close();
    }
}
