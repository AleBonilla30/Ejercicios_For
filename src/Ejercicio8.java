import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner Numero= new Scanner(System.in);

        int resultado= 0;
        double media=0;
        int cantidad=0;
        int cantidadNegativos=0;
        int sumaNegativos=0;

        for (int i = 0; i <10 ; i++) {
            System.out.println("Ingrese los numeros:");
            int num= Numero.nextInt();
            if (num>0){
            resultado= resultado+num;
             media= resultado/10;

            } else if (num<0) {
               sumaNegativos +=num;
               cantidadNegativos++;

            } else {
                cantidad++;

            }


        }
        System.out.println("La media de numeros positivos es: "+media);
        System.out.println("El resultado de los numero negativos es: "+media);
        System.out.println("Cantidad de ceros: "+cantidad);



    }
}
