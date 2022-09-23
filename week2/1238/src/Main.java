import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in=new Scanner(System.in);
        String str;
        int N=in.nextInt();
        str=in.nextLine();
        //str2=in.nextLine();
        for(int i=0;i<N;i++){
            str=in.nextLine();
            method(str);
        }
    }
    public static void method(String st){
        int a=0; String s1, s2;
        String[] s = st.split(" ");
        s1=s[0]; s2=s[1];
        String s3="", t;
        if(s1.length()>=s2.length()){
            a=s2.length();
            t=s1.substring(s2.length(), s1.length());
        }
        else{
            a=s1.length();
            t=s2.substring(s1.length(), s2.length());
        }
        for(int j=0;j<a;j++){
            s3+=s1.charAt(j);
            s3+=s2.charAt(j);
        }
        s3+=t;
        System.out.println(s3);
        s3="";
    }
}