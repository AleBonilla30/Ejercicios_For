import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tabla= new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num= tabla.nextInt();
        if (num>0){

        }else {
            System.out.println("El numero ingresado no es correcto, intentelo nuevamente");
        }
        if (num>=0 && num<=11){
            for (int i = 1; i < 11; i++) {

                System.out.println(num+" x "+i+"= "+num*i);


            }
        }

    }
}
