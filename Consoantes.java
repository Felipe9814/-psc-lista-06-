import java.util.Scanner;
public class Consoantes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char[] Carac = new char[10];
        int conso = 0;
        int vog = 0;
        System.out.println("Caracteres Digitados: ");

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "° digite dez caracteres: ");
            Carac[i] = Character.toUpperCase(ler.next().charAt(0));

        }
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + "°: " + Carac[i] + " \n");
        }

        System.out.println("Consoantes digitadas: \n ");
        for (int i = 0; i < 10; i++) {
            if (Carac[i] >= 'A' && Carac[i] <= 'Z') {
                if (Carac[i] != 'A' && Carac[i] != 'E' && Carac[i] != 'I' && Carac[i] != 'O' && Carac[i] != 'U') {
                    conso++;
                    System.out.println("Consoante " + conso + ": " + Carac[i] + " ");
                }
            }}System.out.println("\nVogais digitadas: \n");
            for (int i = 0; i < 10; i++) {
                if (Carac[i] >= 'A' && Carac[i] <= 'Z') {
                    if (Carac[i] == 'A' || Carac[i] == 'E' || Carac[i] == 'I' || Carac[i] == 'O' || Carac[i] == 'U') {
                        vog++;
                        System.out.println("Vogais " + vog + ": " + Carac[i] + " ");

                    }
                }
            }
            System.out.println("total de vogais: " + vog);
            System.out.println("total de consoante: " + conso);

    }}




