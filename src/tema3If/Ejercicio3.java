package tema3If;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Introduce únicamente la hora");
        hora = Integer.parseInt(sc.nextLine());

        if(hora >= 6 && hora <= 12){
            System.out.println("Buenos días");
        }
        else if(hora >= 13 && hora <= 20){
            System.out.println("Buenas tardes");
        }
        else if(hora >= 21 && hora <25 ||  hora <= 5){
            System.out.println("Buenas noches");
        }else{
            System.out.println("Hora no encontrada");
        }
        sc.close();
    }
}
