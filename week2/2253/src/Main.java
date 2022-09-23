import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean a=false, b=false;
        int x,y,z;
        String str;
        while (in.hasNextLine() && in.hasNextLine()!=false){
            str=in.nextLine();
            a=false; b=true;x=0; y=0; z=0;
            if(str.length()>=6 && str.length()<=32)
                a=true;
            for(int i=0;i<str.length();i++){
                if(Character.isUpperCase(str.charAt(i))) {
                    x++;
                }
                else if(Character.isLowerCase(str.charAt(i))) {
                    y++;
                }
                else if(Character.isDigit(str.charAt(i))){
                    z++;
                }
                else{
                    b=false; break;
                }
            }
            if(a&&b&&x!=0&&y!=0&&z!=0)
                System.out.println("Senha valida.");
            else
                System.out.println("Senha invalida.");
        }
    }
}


