package tema3If;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;

        System.out.println("Introduce un dia de la semana");
        dia = sc.nextLine().toLowerCase();

        if(dia.equals("lunes")){
            System.out.println("Los Lunes toca a primera IPE I");
        }
        else if(dia.equals("martes") ){
            System.out.println("Los martes toca a primera Base de Datos");
        }
        else if(dia.equals("miércoles") ){
            System.out.println("Los miércoles toca a primera Base de Datos");
        }
        else if(dia.equals("jueves") ){
            System.out.println("Los jueves toca a primera DSP");
        }
        else if(dia.equals("viernes") ){
            System.out.println("Los viernes toca a primera IPE I");
        }
        sc.close();
    }
}
