import java.io.IOException;
import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            int X = leitor.nextInt();

            if (X % 2 == 0 && X > 0){
                System.out.println("EVEN POSITIVE");
            } else if(X % 2 == 0 && X < 0){
                System.out.println("EVEN NEGATIVE");
            } else if(X % 2 != 0 && X > 0){
                System.out.println("ODD POSITIVE");
            } else if(X % 2 != 0 && X < 0){
                System.out.println("ODD NEGATIVE");
            } else {
                System.out.println("NULL");
            }
        }
    }
}