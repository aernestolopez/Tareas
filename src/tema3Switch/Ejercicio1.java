package tema3Switch;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;

        dia = sc.nextLine().toLowerCase();

        /*
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
         */

        switch (dia){
            case "lunes":
                System.out.println("Los Lunes toca a primera IPE I");
                break;
            case "martes":
                System.out.println("Los martes toca a primera Base de Datos");
                break;
            case "miércoles":
                System.out.println("Los miércoles toca a primera Base de Datos");
                break;
            case "jueves":
                System.out.println("Los jueves toca a primera DSP");
                break;
            case "viernes":
                System.out.println("Los viernes toca a primera IPE I");
                break;
            default:
                System.out.println("No es un día válido");
        }
        sc.close();
    }
}
