package tema3For;

public class Ejercicio7 {
    public static void main(String[] args) {
        String [] textos={"Piedra", "Papel", "Tijeras"};
        int aleatorio=0;
        String textoAleatorio = "";
        for (int i = 0; i <5; i++){
            aleatorio = (int) (Math.random() * 3) + 1;


        switch (aleatorio) {
            case 1:
                System.out.println(textos[0]);
                break;
            case 2:
                System.out.println(textos[1]);
                break;
            case 3:
                System.out.println(textos[2]);
                break;
        }
        }
    }
}
