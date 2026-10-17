package tema3If;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horasTrabajadas;
        int horasOrdinarias;
        int horasExtraordinarias=0;
        int salario;

        System.out.println("Introduce las horas trabajadas");
        horasTrabajadas = Integer.parseInt(sc.nextLine());

        if(horasTrabajadas > 40){
            horasOrdinarias = 40;
            horasExtraordinarias = horasTrabajadas - 40;
        }
        else{
            horasOrdinarias = horasTrabajadas;
        }
        salario = (horasOrdinarias * 12) + (horasExtraordinarias * 16);

        System.out.println("Su salario es de " + salario);

        sc.close();
    }
}
