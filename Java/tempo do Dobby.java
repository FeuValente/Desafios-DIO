import java.util.Scanner;

public class TempoDoDobby {

    public static void main(String[] args) {

        Scanner leitor =new Scanner(System.in);
        int N = leitor.nextInt();
        int total = leitor.nextInt() + leitor.nextInt();

        if (total <= N){
            System.out.println("Farei hoje!");
        }else System.out.println("Deixa para amanha!");

    }
}