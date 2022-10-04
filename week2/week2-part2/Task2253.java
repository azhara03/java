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
        while(scanner.hasNext()) {
            boolean a = false, b = false, c = false, d = false;
            String s = scanner.nextLine();
            
            if(s.length() >= 6 && s.length() <= 32) {
                a = true;
            }
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                    b = true;
                else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                    c = true;
                else if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    d = true;
                else {
                    d = false;
                    break;
                }
            }
            if(a && b && c && d) {
                System.out.println("Senha valida.");
            }
            else {
                System.out.println("Senha invalida.");
            }
        }
 
    }
 
}