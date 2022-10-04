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
        String s = scanner.next();
        String t = "";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                t += s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) != t.charAt(t.length() - i - 1)) {
                System.out.println("N");
                return;
            }
        }
        System.out.println("S");
 
    }
 
}