package Enums_9;

public class TestClass {
    public static void main(String[] args) {
        Family film = Family.Bheem;
        film = Family.Chotki;

        film = Family.valueOf("Kalia");  // covert string to enum

        for (Family value : Family.values()) {
            System.out.println(value );
        }
    }
}
