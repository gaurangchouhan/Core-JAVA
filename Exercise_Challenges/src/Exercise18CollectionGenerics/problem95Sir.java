package Exercise18CollectionGenerics;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problem95Sir {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();

        for (char ch : s.toCharArray()) {
            unique.add(ch);
        }
            System.out.printf("Your unique characters are %d", unique.size());
    }
}
