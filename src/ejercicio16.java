import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner factorial= new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int numero= factorial.nextInt();
        int factorial1= 1;
        for (int i = 1; i < numero; i++) {
            factorial1 = factorial1*i;
        } System.out.println("El factorial es: "+factorial1);
    }
}
