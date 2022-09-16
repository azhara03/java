import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int T, PA, PB, j=0;
        double G1, G2;
        T = in.nextInt();
        for(int i=0;i<T;i++) {
            PA=in.nextInt();
            PB=in.nextInt();
            G1=in.nextDouble();
            G2=in.nextDouble();
            while(PA<=PB && j<=101){
                j++;
                PA=PA+(int)((PA*G1)/100);
                PB=PB+(int)((PB*G2)/100);
            }
            if(j<=100){
                System.out.println(j+" anos.");
            }
            else{
                System.out.println("Mais de 1 seculo.");
            }
            j=0;
        }
    }
}