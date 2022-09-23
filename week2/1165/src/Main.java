import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x;
        boolean flag=false;
        for(int i=0;i<n;i++){
            x=in.nextInt();
            if(x%2==0 && x!=2){
                System.out.println(x + " nao eh primo");
            }
            else if(x==1 || x==2 || x==3)
                System.out.println(x + " eh primo");
            else{
                for(int j=2;j<=x/2;j++){
                    if(x%j!=0){
                        flag=true;
                    }
                    else{
                        flag=false;
                        System.out.println(x + " nao eh primo");
                        break;
                    }
                }
                if(flag){
                    System.out.println(x + " eh primo");
                }
            }
            flag=false;
        }
    }
}