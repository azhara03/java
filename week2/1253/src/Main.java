import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in=new Scanner(System.in);
        int y=0, x, a=0;
        String codSent, decod="";
        int N=in.nextInt();
        codSent=in.nextLine();
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<N;i++){
            codSent=in.nextLine();
            if(a!=0)
                codSent=in.nextLine();
            x=in.nextInt();
            for(int j=0;j<codSent.length();j++){
                if(s.indexOf(codSent.charAt(j))<x){
                    y=s.indexOf(codSent.charAt(j))+26-x;
                    decod+=s.charAt(y);
                }
                else{
                    y=s.indexOf(codSent.charAt(j))-x;
                    decod+=s.charAt(y);
                }
            }
            a++;
            System.out.println(decod);
            decod="";

        }
    }
}