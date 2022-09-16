import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        ArrayList<Float> arr = new ArrayList<>();
        float a, b, c;
        for(int i=0;i<N;i++){
            a=in.nextFloat();
            b=in.nextFloat();
            c=in.nextFloat();
            arr.add(i, (a*2+b*3+c*5)/10);
        }
        DecimalFormat decimalFormat=new DecimalFormat("#.#");
        for(int i=0;i<N;i++){
            System.out.format("%.1f",(arr.get(i)));
            System.out.println();
            //System.out.println(decimalFormat.format(arr.get(i)));
        }
    }

}