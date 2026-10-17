package tema3If;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1,nota2,nota3, resultadoMedia;

        System.out.println("Introduce la primera nota:");
        nota1 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce la segunda nota:");
        nota2 = Double.parseDouble(sc.nextLine());
        System.out.println("Introduce la tercera nota:");
        nota3 = Double.parseDouble(sc.nextLine());

        resultadoMedia = ((nota1 + nota2 + nota3) / 3);
        System.out.println("Nota media " + resultadoMedia);
        if(resultadoMedia < 5){
            System.out.println("Insuficiente");
        }
        else if(resultadoMedia == 5){
            System.out.println("Suficiente");
        }
        else if(resultadoMedia == 6){
            System.out.println("Bien");
        }
        else if(resultadoMedia >= 7 && resultadoMedia < 9){
            System.out.println("Notable");
        }
        else if(resultadoMedia >= 9 && resultadoMedia <= 10){
            System.out.println("Sobresaliente");
        }
        sc.close();
    }
}
