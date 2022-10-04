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
 
        long []arr = new long[70];
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= 60; i++) {
            arr[i] = arr[i - 1] + arr[i - 2]; 
        }
        while(t > 0) {
            t--;
            int n = scanner.nextInt();
            System.out.println("Fib(" + n + ") = " + arr[n]);
        }
 
    }
 
}