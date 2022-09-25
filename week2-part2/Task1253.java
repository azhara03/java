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
            String s = scanner.next();
            String ans = "";
            int n = scanner.nextInt();
            for(int i = 0; i < s.length(); i++) {
                char c = (char)((int)s.charAt(i) - n);
                if(c < 'A') {
                    c = (char)((int)c + (int)'Z' - (int)'A' + 1);
                }
                ans += c;
            }
            System.out.println(ans);
        }
 
    }
 
}