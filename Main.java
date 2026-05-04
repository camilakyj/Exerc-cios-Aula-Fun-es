// Camila Aki Yagima Jeronimo
package dobackofront;
import java.util.Scanner;
public class Main {

    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número (ou -1 para sair): ");
            int numero = entrada.nextInt();


            if (numero == -1) {
                break;
            }


            if (isPar(numero)) {
                System.out.println("número par");
            } else {
                System.out.println("número impar");
            }
        }
    }
}