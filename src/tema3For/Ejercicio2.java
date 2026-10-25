package tema3For;

public class Ejercicio2 {
    public static void main(String[] args) {
        int [] numeros = {4,7,-8,2,-4,10,-5,-8,2,2};
        int contadorPositivo=0;
        int contadorNegativo=0;

        for (int numero : numeros){
            if(numero < 0){
                contadorNegativo++;
            }else{
                contadorPositivo++;
            }
        }

        System.out.println("Hay " + contadorPositivo +" numeros positivos y hay " + contadorNegativo + " numeros negativos");
    }
}
