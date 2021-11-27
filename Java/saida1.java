public class Saida1 {

    public static void main(String[] args) {

        for (int i = 0; i < 39; i++) {
            System.out.print("-");

        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 39; j++) {

            if (j == 0 || j == 38){
                System.out.print("|");
            } else System.out.print(" ");

            }
            System.out.println();
        }


        for (int i = 0; i < 39; i++) {
            System.out.print("-");

        }

    }
}