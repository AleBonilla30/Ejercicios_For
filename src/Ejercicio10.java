import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner Notas=new Scanner(System.in);
         int aprobados=0;
         int suspensos=0;
         int condicionados=0;
        for (int i = 1; i < 7; i++) {
            System.out.println("Ingrese la nota"+i+":");
            double notas1= Notas.nextDouble();
            if (notas1>=5.0){
                aprobados++;

            }
            else if (notas1==4) {
                condicionados++;
            }
            else {
                suspensos++;
            }

            }
        System.out.println("Alumnnos suspendidos "+suspensos);
        System.out.println("Alumnos condicionados "+condicionados);
        System.out.println("Alumnos aprobados "+aprobados);

        }
    }

