import java.util.Scanner;
public class NrPrime {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int number = input.nextInt();
        System.out.println(isPrime(number));
    }
    public static boolean isPrime(int number){

        int Count = 0;

        for(int i=1;i<(number + 1);i++){
            if(number % i==0){
                Count++;
            }
        }
        if (Count == 2)
            return true;
        else
            return false;
    }
}
