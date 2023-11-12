import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner calculo= new Scanner(System.in);
        System.out.println("Introduce un numero entre 0 y 5:");
        int base= calculo.nextInt();
        System.out.println("Introduce el segundo numero entre 0 y 5:");
        int exponente= calculo.nextInt();

         int resultado= 1;

        for (int i = 0; i < 5; i++) {
            resultado=resultado*base;



        }
        System.out.println("El resultado es: "+resultado);
    }


    }


