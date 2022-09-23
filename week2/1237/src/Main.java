import java.io.IOException;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in=new Scanner(System.in);
        int x=0,y=0;
        String str, str2;
        while (in.hasNextLine()){
            str=in.nextLine();
            str2=in.nextLine();
            x=0;y=0;
            for(int i=0;i<str.length();i++){
                for(int j=0;j<str2.length();j++){
                    if(str.charAt(i)==str2.charAt(j)){
                        x=0;
                        for(int a=i,b=j; a<str.length()&&
                                b<str2.length(); a++,b++){
                            if(str.charAt(a)!=str2.charAt(b))
                                break;
                            x++;
                        }
                        if(x>y)
                            y=x;

                    }
                }
            }
            System.out.println(y);
        }

    }



}