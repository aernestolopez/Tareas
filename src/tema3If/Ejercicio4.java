package tema3If;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDia;

        System.out.println("Introduce el número de día");
        numDia = Integer.parseInt(sc.nextLine());

        if(numDia == 1){
            System.out.println("Lunes");
        }
        else if(numDia == 2){
            System.out.println("Martes");
        }
        else if(numDia == 3){
            System.out.println("Miércoles");
        }
        else if(numDia == 4){
            System.out.println("Jueves");
        }
        else if(numDia == 5){
            System.out.println("Viernes");
        }
        else if(numDia == 6){
            System.out.println("Sábado");
        }
        else if(numDia == 7){
            System.out.println("Domingo");
        }
        sc.close();
    }
}
