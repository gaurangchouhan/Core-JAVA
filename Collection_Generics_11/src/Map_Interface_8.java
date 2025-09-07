import java.util.HashMap;
import java.util.Map;

public class Map_Interface_8  {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Gaurang", 95);
        map.put("Gaurav", 35);
        map.put("Gautam", 98);
        map.put("Gauri", 54);
        map.put("Limi", 92);

        System.out.println(map.size());
        System.out.println(map.get("Limi"));
        System.out.println(map.containsKey("Gauri"));
        System.out.println(map.remove("Gaurav"));
        System.out.println(map.size());
        System.out.println(map.values());

        for (String value : map.keySet()) {
            System.out.printf("%s : %s\n ", value, map.get(value));
        }
    }
}
