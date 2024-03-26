import java.util.*;
public class Questao_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe  a palavra que deseja que seja invertida: ");
        String original = sc.next();

        String invertida = "";

        for (int i = original.length() - 1; i >= 0; i--) {

            invertida += original.charAt(i);

        }

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}
