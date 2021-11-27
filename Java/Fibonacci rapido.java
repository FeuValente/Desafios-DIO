import java.util.Scanner;

public class FibonacciRapido {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double x, y;
        double n = leitor.nextInt();

        x = (1 + Math.sqrt(5))/2;
        y = (1 - Math.sqrt(5))/2;

        double fibonacci = (Math.pow(x,n) - Math.pow(y, n))/Math.sqrt(5);

        System.out.printf("%.1f", fibonacci);
        leitor.close();
    }
}