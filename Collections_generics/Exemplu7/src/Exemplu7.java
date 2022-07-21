import java.util.*;

public class Exemplu7 {
    public static void main(String[] args) {

        List<String> locationList = new ArrayList<String>();
        locationList.add("Suceava");
        locationList.add("Iasi");
        locationList.add("Bucuresti");
        Collections.sort(locationList);

        for (String location : locationList) {
            System.out.println("Locatia este: " + location);
        }
    }
}
