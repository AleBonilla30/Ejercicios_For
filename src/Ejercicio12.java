public class Ejercicio12 {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                if (i==0 || i==5){
                    System.out.print("-\t");

                }
                else if (j==0 || j==5) {

                    System.out.print("-\t");
                } else {
                    System.out.print("+\t");
                }
            }
            System.out.println();

        }


    }
}
