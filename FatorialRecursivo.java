import java.util.Scanner;

public class FatorialRecursivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um numero: ");
        int valor = sc.nextInt();

        System.out.println(Fatorial(valor));

    }

    public static int Fatorial(int valor) {
        if (valor == 0 || valor == 1) {
            return 1;
        } else {
            return valor * Fatorial(valor - 1);
        }
    }
}