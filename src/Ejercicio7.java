import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner dados= new Scanner(System.in);
        System.out.println("Introduce el numero de lanzamientos del dado:");
        int dados1= dados.nextInt();
        if (dados1>=0 ){
            dados1=100;
        }
        System.out.println("resultado del lanzamiento de los dados:");
        Random ramdom= new Random();
        for (int i = 0; i <dados1 ; i++) {
            int resultado= ramdom.nextInt(6)+1;
            System.out.println("Lanzamiento "+i+":"+resultado);

        }



    }
}
