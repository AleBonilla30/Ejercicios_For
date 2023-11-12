import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner Palabra= new Scanner(System.in);
        System.out.println("Introduce la palabra: ");
        String Pala1= Palabra.nextLine();

        String inversa= "";
        for (int i = Pala1.length() -1; i >= 0; i--) {
            inversa += Pala1.charAt(i);



        }
        System.out.println("La inversa de la palabra es: "+inversa);
    }
}
