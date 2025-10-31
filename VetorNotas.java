import java.util.Scanner;

public class VetorNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] nome = new String[10];
        double[][] notas = new double[10][4];
        double[] medias = new double[10];
        int aprovados = 0;

        // Ler nome e notas de cada aluno
        for (int i = 0; i < 10; i++) {
            System.out.print("\nNome do aluno " + (i + 1) + ": ");
            nome[i] = ler.nextLine();

            double soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                notas[i][j] = ler.nextDouble();
                soma += notas[i][j];
            }

            medias[i] = soma / 4;

            if (medias[i] >= 7.0) {
                aprovados++;
            }

            ler.nextLine(); // limpa o buffer antes de ler o próximo nome
        }

        // Exibir resultados
        System.out.println("\n--- Médias dos alunos ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s: média = %.2f\n", nome[i], medias[i]);
        }

        System.out.println("\nQuantidade de alunos com média >= 7.0: " + aprovados);
    }
}
