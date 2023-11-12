import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double media= 0.0;
        Scanner Temperatur= new Scanner(System.in);

       for (int i=0; i<2; i++){
           System.out.println("Introduce el numero de temperatura: ");
           int temp1= Temperatur.nextInt();
           media= temp1+temp1/media;
           if (temp1<=0 ){
               temp1=10;
               System.out.println("Se ha establecido el numero de temperatura a 10");

           }

       }
        System.out.println("El programa termina");
        System.out.println("La media de las temperatura es:"+media);

    }
}
