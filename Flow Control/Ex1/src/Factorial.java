import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Introduceti numarul al carui factorial doriti sa il aflati");
        int nr=scan.nextInt();
        factorial(nr);
    }
    static void factorial(int nr)
    {
        int i,f=1;
        for(i=1; i<=nr; i++)
        {
            f=f*i;
        }
        System.out.print("Factorialul lui " + nr + " este: "+f);
    }
}