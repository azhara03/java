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
        for(int c = 1; c <= t; c++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList();
            ArrayList<Integer> d = new ArrayList();
            for(int i = 1; i <= a; i++) {
                list.add(i);
                d.add(0);
            }
            int k = b - 1;
            int n = list.size();
            while(n > 1) {
                for(int i = 0; i < list.size(); i++) {
                    if(d.get(i) == 0 && k == 0 && n > 1) {
                        k = b - 1;
                        d.set(i, 1);
                        n--;
                    }
                    else if(d.get(i) == 0) {
                        k--;
                    }
                }
            }
            for(int i = 0; i < list.size(); i++) {
                if(d.get(i) == 0) {
                    System.out.println("Case " + c + ": " + (i + 1));
                }
            }
        }
 
    }
 
}