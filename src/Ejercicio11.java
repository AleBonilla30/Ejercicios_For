import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner cuadrado= new Scanner(System.in);
        System.out.println("Introduce el tamaño: ");
        int tamañoLado= cuadrado.nextInt();
        for (int i = 0; i <tamañoLado ; i++) {
            for (int j = 0; j < tamañoLado; j++) {
                System.out.print(" + ");
                System.out.println();

            }




        }
    }
}
