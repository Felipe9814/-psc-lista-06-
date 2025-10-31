import java.util.Scanner;
public class NumerosInteiros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] num = new int[20];

        for(int i = 0 ; i < 20 ; i++ ){
        System.out.println("Digite numero "+ (i+1) +"°: " );
        num[i] = ler.nextInt();
        } System.out.println( "Os numeros digitados: \n");
        for (int i = 0; i < 20; i++){
        if(i>=0 && i<19) {
            System.out.print(num[i] + ", ");
        } else {
            System.out.print(num[i]+"\n");
        }
    }}
}