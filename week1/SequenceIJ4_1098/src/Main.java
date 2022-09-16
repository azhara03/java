import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        float i=0f;
        float j=0f;
        while(i<=2.1){
            //for(float i=0; i<2.2;i+=0.2f){
            for(int k=1; k<4;k++){
                j=k+i;
                if(i==1 || i==0 || i>2)
                    System.out.println("I=" + (int)i +" J=" + (int)j);
                else
                    System.out.println("I=" + String.format("%.1f",i) +" J=" + String.format("%.1f",j));
            }
            i+=0.2;
            //}
        }
    }
}