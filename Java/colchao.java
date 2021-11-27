import java.util.Scanner;

public class Colchao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String messagem;
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int H = leitor.nextInt();
        int L = leitor.nextInt();


        if( B <= H && A <= L){messagem = "S";
        }else if (C <= H && A <= L){messagem = "S";
        }else if ( A <= H && C <= L){messagem = "S";
        }else messagem = "N";

        System.out.println(messagem);
        leitor.close();
    }
}