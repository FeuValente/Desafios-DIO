import java.util.Scanner;
public class Xadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(); //Numero de linhas do tabuleiro
        int C = sc.nextInt(); //Numero de colunas do tabuleiro
        if ((L % 2 != 0) && C % 2 != 0) // Se linha e coluna forem valores ímpares
            System.out.println("  1 "); //Cor branca
        else
            System.out.println(" 0  "); //Cor preta
        sc.close();
    }
}