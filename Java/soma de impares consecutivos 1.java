import java.util.Scanner;

public class SomaDeImparesConsecutivosI {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int x, y, soma = 0;
        x = leitor.nextInt();
        y = leitor.nextInt();


            if ( x == y){
                soma = 0;
            }else if ( x < y){
               for (int i = x+1; i < y; i++) {
                   if (i%2 != 0){
                       soma += i;
                   }
               }
            }else {
                for (int i = y + 1; i < x; i++) {
                    if (i % 2 != 0) {
                        soma += i;
                    }
                }
            }

        System.out.println(soma);

        }
    }
