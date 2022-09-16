import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int N, banknote100=0, banknote50=0, banknote20=0, banknote10=0, banknote5=0, banknote2=0, banknote1=0;
        N=in.nextInt();
        int number=N;
        if(N>=100) {
            banknote100 = N / 100;
            N = N % 100;
        }
        if(N>=50) {
            banknote50 = N / 50;
            N = N % 50;
        }
        if(N>=20)
        {
            banknote20=N/20;
            N=N%20;
        }
        if(N>=10)
        {
            banknote10=N/10;
            N=N%10;
        }
        if(N>=5)
        {
            banknote5=N/5;
            N=N%5;
        }
        if(N>=2)
        {
            banknote2=N/2;
            N=N%2;
        }
        banknote1=N;
        System.out.println(number);
        System.out.printf(banknote100 + " nota(s) de R$ 100,00\n");
        System.out.printf(banknote50 + " nota(s) de R$ 50,00\n");
        System.out.printf(banknote20 + " nota(s) de R$ 20,00\n");
        System.out.printf(banknote10 +" nota(s) de R$ 10,00\n");
        System.out.printf(banknote5 +" nota(s) de R$ 5,00\n");
        System.out.printf(banknote2 +" nota(s) de R$ 2,00\n");
        System.out.printf(banknote1 +" nota(s) de R$ 1,00\n");
    }

}