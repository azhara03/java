import java.io.IOException;
import java.util.*;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t > 0) {
            t--;
            String a = scanner.next();
            String b = scanner.next();
            String ans = "";
            
            for(int i = 0; i < a.length() || i < b.length(); i++) {
                if(i < a.length())
                    ans += a.charAt(i);
                if(i < b.length())
                    ans += b.charAt(i);
            }
            System.out.println(ans);
        }
 
    }
 
}