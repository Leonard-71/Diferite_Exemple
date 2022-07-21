import java.util.*;

public class Exemplu4 {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);

        set.add(10);
        set.add(50);

        set.add(50);

        Iterator<Integer> it = set.iterator();
        System.out.println(
                "Iterate HashSet using iterator : ");

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}

