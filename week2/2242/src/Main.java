import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in=new Scanner(System.in);
        String str;
        str=in.nextLine();
        method(str);
    }
    public static void method(String st){
        int a=0; String s1, s2;
        String s3="", t="";
        a=st.length()-1;
        for(int j=0;j<st.length();j++){
            if(st.charAt(j)=='a' || st.charAt(j)=='e' || st.charAt(j)=='i' || st.charAt(j)=='o' || st.charAt(j)=='u'){
                s3+=st.charAt(j);
            }
            if(st.charAt(a)=='a' || st.charAt(a)=='e' || st.charAt(a)=='i' || st.charAt(a)=='o' || st.charAt(a)=='u'){
                t+=st.charAt(a);
            }
            a--;
        }
        if(s3.compareTo(t)==0)
            System.out.println("S");
        else
            System.out.println("N");
    }
}