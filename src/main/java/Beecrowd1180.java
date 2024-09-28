import java.util.Scanner;

public class Beecrowd1180 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int N;
        int posicao = 0;
        int menor = Integer.MAX_VALUE;
        N = scanner.nextInt();
        scanner.nextLine();
        int X[] = new int[N];

        String sequencia;
        String[] partes;
        sequencia = scanner.nextLine();
        partes = sequencia.split(" ");

        for (int i = 0; i < N; i++) {
            X[i] = Integer.parseInt(partes[i]);
            if (X[i] < menor) {
                menor = X[i];
                posicao = i;
            }
        }
        System.out.printf("Menor valor: %d%nPosicao: %d%n", menor, posicao);
    }
}
