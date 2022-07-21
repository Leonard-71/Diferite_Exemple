import java.util.*;
public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Citeste un sir ");
        Scanner sir = new Scanner(System.in);
        System.out.println(palindrome(sir));
    }

    static boolean palindrome(Scanner sir)
    {
         int TRUE_VALUE =1;
         int FALSE_VALUE =0;
        String cuvant = sir.nextLine();
        char[] myArray = cuvant.toCharArray();
        int size = myArray.length;
        char[] original = Arrays.copyOf(myArray, myArray.length);
        for (int i = 0; i < size / 2; i++) {
            char temp = myArray[i];
            myArray[i] = myArray[size-i-1];
            myArray[size-i-1] = temp;
        }
        //System.out.println("Sirul initial "+Arrays.toString(original));
       // System.out.println("Sirul Oglindit "+Arrays.toString(myArray));

        if(Arrays.equals(myArray, original))
            return true;
        else
            return false;
    }


























/*
    void palindrome(int arr[], int n)
    {
    }









        // Initialise flag to zero.
        int flag = 0;

        // Loop till array size n/2.
        for (int i = 0; i <= n / 2 && n != 0; i++) {

            // Check if first and last element are different
            // Then set flag to 1.
            if (arr[i] != arr[n - i - 1]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            return true;
        else
            System.out.println("Palindrome");
    }

    // Driver code.
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 2, 1 };
        int n = arr.length;
        palindrome(arr, n);
    }
*/


}
