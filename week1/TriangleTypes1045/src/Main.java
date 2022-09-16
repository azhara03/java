import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        double A, B, C;
        A=in.nextDouble();
        B=in.nextDouble();
        C=in.nextDouble();
        if(A<B && B>=C){
            double x=A;
            A=B;
            B=x;
        }
        if(A<C && C>=B){
            double x=A;
            A=C;
            C=x;
        }
        if(A >= B + C){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if(Math.pow(A,2) == (Math.pow(B,2) + Math.pow(C,2))){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if(Math.pow(A,2) > (Math.pow(B,2) + Math.pow(C,2))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if(Math.pow(A,2) < (Math.pow(B,2) + Math.pow(C,2))){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(A == B && B == C){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if((A == B && A != C) || (B==C && B!=A)||(A==C && A!=B)){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }

}