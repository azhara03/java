import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt(); float result=0;
        char T=in.next().charAt(0);
        float[][] M = new float[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j]=in.nextFloat();
            }
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if(j==N){
                    result+=M[i][j];
                }
            }
        }
        if(T=='S')
            System.out.format("%.1f",result);
        else
            System.out.format("%.1f",result/12);
        System.out.println();
    }
}