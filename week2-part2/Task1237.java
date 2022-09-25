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
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            int ans = 0;
            for(int i = 0; i < a.length(); i++) {
                for(int j = 0; j < b.length(); j++) {
                    int k = 0;
                    while(i + k < a.length() && j + k < b.length()&& a.charAt(i + k) == b.charAt(j + k)) {
                        k++;
                    }
                    if(ans < k) {
                        ans = k;
                    }
                }
            }
            System.out.println(ans);
        }
 
    }
 
}