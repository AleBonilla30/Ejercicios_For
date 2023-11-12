import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner pares= new Scanner(System.in);
        System.out.println("Ingresa un numero:");
        int num1= pares.nextInt();
        System.out.println("Ingresa el segundo numero:");
        int num2= pares.nextInt();

        System.out.println("Numeros pares entre "+num1+" "+num2);
        if (num1<=num2){
            for (int i = num1; i <num2 ; i++) {
                if (i%2==0){
                    System.out.println(i);
                }
                
            }
        }


    }


}


