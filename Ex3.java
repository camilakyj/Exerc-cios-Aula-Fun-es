// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;

public class Main {


    public static int encontrarMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();


        int maior = encontrarMax(num1, num2);


        System.out.println("O maior número é: " + maior);
    }
}
