import java.util.*;
public class Questao_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int n2 = 1;
        System.out.println("insira a posição que gostaria de consultar: ");

        int posicao = sc.nextInt();

        for (int i = 1 ; i < posicao ; i++){

            int flag = n2;
            n2 = n2 + n;
            n = flag;

        }

        System.out.println("Resultado: " + n2);

    }
}
