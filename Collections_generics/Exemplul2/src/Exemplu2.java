
import java.util.Scanner;
import java.util.*;
public class Exemplu2 {
    static void removeDuplicate(char str[], int n)
    {
        HashSet<Character> s = new LinkedHashSet<>(n - 1);
        for (char x : str)
            s.add(x);
        for (char x : s)
            System.out.print(x);
    }
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String name= scan.next();
        char str[] = name.toCharArray();
        int n = name.length();

        removeDuplicate(str, n);
    }
}
