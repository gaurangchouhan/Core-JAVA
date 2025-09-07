package Exercise18CollectionGenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problem98Map {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        country.put("India", "Delhi");
        country.put("Australia", "Canberra");
        country.put("China", "Beijing");
        country.put("New Zealand", "Wellington");
        country.put("United Kingdom", "London");

        String countryName = sc.next();
        if (country.containsKey(countryName)) {
            System.out.println(country.get(countryName));
        }else {
            System.out.println("this name does not contain in map ");
        }
    }
}
