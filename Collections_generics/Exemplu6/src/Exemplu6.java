import java.util.HashMap;
import java.util.Map;

public class Exemplu6 {

    public static void main(String[] arguments)
    {
        Map<Integer, String> intType = new HashMap<Integer, String>();

        intType.put(1, "Suceava");
        intType.put(2, "Iasi");
        intType.put(3, "Bucuresti");
        intType.entrySet().stream().forEach(
                input -> System.out.println(input.getKey() + " : "+ input.getValue()));
    }

}
