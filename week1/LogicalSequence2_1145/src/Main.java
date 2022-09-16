import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int x = in.nextInt();int k=1;
        int y = in.nextInt();
        for(int i=1; i<=y/x;i++){
            do{
                if(k%x==0)
                    System.out.print(k);
                else
                    System.out.printf(k+" ");
                k++;
            }while(k%x!=1);
            System.out.println();
        }
        int m=k;
        for(int i=0; i<=y-m;i++){
            System.out.printf(k+" ");
            k++;
        }
    }
}