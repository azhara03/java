import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int x, j=1, sum=0;
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            x = in.nextInt();
            while(j<=(int)(x/2)){
                if(x%j==0){
                    sum+=j;
                }
                j++;
            }
            if(sum==x)
                System.out.println(x + " eh perfeito");
            else
                System.out.println(x + " nao eh perfeito");
            sum=0; j=1;
        }

    }

}