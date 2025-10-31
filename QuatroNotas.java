import java.util.Scanner;
public class QuatroNotas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] num = new double[4];
        double soma = 0;
        double media= 0;

        for(int i = 0 ; i < 4 ; i++) {
            System.out.println((i + 1) + "° nota: ");
            num[i] = ler.nextDouble();
            soma += num[i] ;
        }System.out.println("Resultados: ");
        for (int i = 0 ; i < 4 ; i++){

            System.out.println((i+1)+"° nota " + num[i]);
        }

        media = soma / 4 ;
        System.out.println("A media das notas: " + media );


    }
}