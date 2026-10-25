package tema3For;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroLoteria;
        for (int i=1;  i <=5; i++){
            numeroLoteria = (int) (Math.random() * 10);
            System.out.print(numeroLoteria);
        }
    }
}
