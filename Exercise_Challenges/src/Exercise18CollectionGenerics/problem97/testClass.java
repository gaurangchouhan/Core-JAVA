package Exercise18CollectionGenerics.problem97;

import Exercise18CollectionGenerics.problem96.Week;

public class testClass {
    public static void main(String[] args) {
        for (Day value : Day.values()) {
            System.out.printf("%s : %s\n ", value, value.getType());
        }
    }
}
