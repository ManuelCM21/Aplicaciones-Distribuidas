import java.util.ArrayList;
import java.util.List;

public class Cities extends Thread {

    public static void main(String[] args) {

        List<String> city = new ArrayList<String>();
        city.add("Juliaca");
        city.add("Cusco");
        city.add("Puno");
        city.add("Moquegua");
        city.add("Quellouno");
        city.add("Calca");
        for (int i = 0; i < city.size(); i++) {
            System.out.println(city.get(i));
        }

        System.out.println();
        for (String cities : city) {
            System.out.println(cities);
        }

        System.out.println();
        city.stream().forEach(s -> System.out.println(s));

        System.out.println();
        city.stream().parallel().forEach(s -> System.out.println(s));
    }
}