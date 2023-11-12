import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        int aleatorio= (int)(Math.random()*30)+1;

        Scanner intento= new Scanner(System.in);
        for (int i = 1; i < 10; i++) {
            System.out.println("Adivina el numero: ");
            int intentos1= intento.nextInt();

            if (intentos1 == aleatorio && intentos1>=0 && intentos1<=10){

                System.out.println("Felicidades has adivinado el numero en "+i+"intentos");
                break;
            }


        }
        System.out.println("Lo siento has agotado todos los intentos");

    }
}
