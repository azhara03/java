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
        float N;
        int moeda100=0,moeda50=0,moeda25=0,moeda10=0,moeda5=0,moeda1=0;
        int banknote100=0, banknote50=0, banknote20=0, banknote10=0, banknote5=0, banknote2=0;
        N=in.nextFloat();
        if(N>=100) {
            banknote100 = (int)N / 100;
            N = N % 100;
        }
        if(N>=50) {
            banknote50 = (int)N / 50;
            N = N % 50;
        }
        if(N>=20){
            banknote20=(int)N/20;
            N=N%20;
        }
        if(N>=10) {
            banknote10=(int)N/10;
            N=N%10;
        }
        if(N>=5){
            banknote5=(int)N/5;
            N=N%5;
        }
        if(N>=2){
            banknote2=(int)N/2;
            N=N%2;
        }
        double scale = Math.pow(10, 3);
        N = (float)(Math.ceil(N * scale) / scale);
        N=(N*100);
        if(N>=100) {
            moeda100 = (int)N / 100;
            N = N % 100;
        }
        if(N>=50) {
            moeda50 = (int)N / 50;
            N = N % 50;
        }
        if(N>=25){
            moeda25=(int)N/25;
            N=N%25;
        }
        if(N>=10) {
            moeda10=(int)N/10;
            N=N%10;
        }
        if(N>=5){
            moeda5=(int)N/5;
            N=N%5;
        }
        moeda1=(int)N;

        System.out.println("NOTAS:");
        System.out.printf(banknote100 + " nota(s) de R$ 100.00\n");
        System.out.printf(banknote50 + " nota(s) de R$ 50.00\n");
        System.out.printf(banknote20 + " nota(s) de R$ 20.00\n");
        System.out.printf(banknote10 +" nota(s) de R$ 10.00\n");
        System.out.printf(banknote5 +" nota(s) de R$ 5.00\n");
        System.out.printf(banknote2 +" nota(s) de R$ 2.00\n");
        System.out.println("MOEDAS:");
        System.out.printf(moeda100 + " moeda(s) de R$ 1.00\n");
        System.out.printf(moeda50 + " moeda(s) de R$ 0.50\n");
        System.out.printf(moeda25 + " moeda(s) de R$ 0.25\n");
        System.out.printf(moeda10 +" moeda(s) de R$ 0.10\n");
        System.out.printf(moeda5 +" moeda(s) de R$ 0.05\n");
        System.out.printf(moeda1 +" moeda(s) de R$ 0.01\n");
    }

}