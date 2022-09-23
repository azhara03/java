import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char s = scanner.next().charAt(0);
        float sum = 0;
        float [][]m = new float[12][12];
        for(int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
                m[i][j] = scanner.nextFloat();
            }
        }
        
        for(int i = 0; i < 12; i++) {
            sum += m[i][n];
        }
        if(s == 'S') {
            System.out.printf("%.1f", sum);
            System.out.println();
        }
        else {
            System.out.printf("%.1f", sum / 12);
            System.out.println();
        }
    }
 
}