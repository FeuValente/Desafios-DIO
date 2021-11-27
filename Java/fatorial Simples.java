import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt();
        int fato = n;
        
        for (int i = n - 1; i > 0; i--) {
            fato *= i;
        }
        
        System.out.println(fato);
    }
    
}