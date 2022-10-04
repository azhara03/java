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
            int n = scanner.nextInt();
            boolean f = false;
            for(int i = 2; i * i <= n; i++) {
                if(n % i == 0) {
                    f = true;
                    break;
                }
            }
            if(f) {
                System.out.println("" + n + " nao eh primo");
            }
            else {
                System.out.println("" + n + " eh primo");
            }
        }
 
    }
 
}