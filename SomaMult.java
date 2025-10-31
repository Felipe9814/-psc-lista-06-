import java.util.Scanner;
public class SomaMult {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[2];
        int[] calculo = new int[2];
        calculo[0]=0;
        calculo[1]=1;
        for(int i = 0 ; i< num.length ; i++){
        System.out.println("Digite o "+(i+1)+"° numero: ");
        num[i] = ler.nextInt();
        calculo[0] += num[i];
        calculo[1] *= num[i];

    }   System.out.println("Valores somados: " + calculo[0]);
        System.out.println("Valores multiplicados: " + calculo[1]);

    }
}