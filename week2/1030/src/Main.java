import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int nc=in.nextInt();
        int n,k, x=0;

        for(int i=0;i<nc;i++){

            n=in.nextInt();
            k=in.nextInt();
            for(int j=2;j<=n;j++){
                x = (x + k) % j;
            }
            System.out.println("Case "+(int)(i+1)+": "+(int)(x+1));
            x=0;
        }
    }
}