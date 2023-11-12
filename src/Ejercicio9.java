import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        double cantidad=0;
        double media=0;
        int sueldoMayor1000=0;
        Scanner Sueldos= new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
            System.out.println("Introduce los sueldos: ");
            double sueldos1= Sueldos.nextDouble();
            cantidad=cantidad+sueldos1;
            media= cantidad/10;
            if (sueldos1>1000){
                sueldoMayor1000++;
            }

        }
        System.out.println("La suma de los sueldos son: "+cantidad);
        System.out.println("La media de los sueldos son: "+media);
        System.out.println("Los sueldos mayores de 1000: "+sueldoMayor1000);
    }
}
