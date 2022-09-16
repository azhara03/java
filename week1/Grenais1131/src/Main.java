import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int grenais=0, empates=0, numInter=0, numGremio=0;
        int x;
        do{
            int Inter=in.nextInt();
            int Gremio=in.nextInt();
            grenais++;
            if(Inter<Gremio){
                numGremio++;
            }
            else if(Inter>Gremio){
                numInter++;
            }
            else{
                empates++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            x=in.nextInt();
        }while(x!=2);
        System.out.println(grenais+" grenais");
        System.out.println("Inter:"+numInter);
        System.out.println("Gremio:"+numGremio);
        System.out.println("Empates:"+empates);
        if(numInter>numGremio){
            System.out.println("Inter venceu mais");
        }
        else if(numInter<numGremio){
            System.out.println("Gremio venceu mais");
        }
        else {
            System.out.println("Não houve vencedor");
        }
    }
}