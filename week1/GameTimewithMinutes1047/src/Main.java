import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int initH, initM, finalH, finalM, durH=0, durM=0;
        initH=in.nextInt();
        initM=in.nextInt();
        finalH=in.nextInt();
        finalM=in.nextInt();
        if(initH<finalH){
            if(initM<=finalM){
                durH=finalH-initH;
                durM=finalM-initM;
            }
            else{
                durH=finalH-initH-1;
                durM=finalM+60-initM;
            }
        }
        else if(initH>finalH){
            if(initM>finalM){
                durH=24-initH+finalH-1;
                durM=finalM+60-initM;
            }
            else{
                durH=24-initH+finalH;
                durM=finalM-initM;
            }
        }
        else {
            if(initM<finalM){
                durH=finalH-initH;
                durM=finalM-initM;
            }
            else if(initM>finalM){
                durH=23;
                durM=finalM+60-initM;
            }
            else {
                durH=24;
                durM=0;
            }
        }
        System.out.println("O JOGO DUROU " + durH + " HORA(S) E " + durM + " MINUTO(S)");
    }

}