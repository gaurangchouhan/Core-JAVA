import java.io.FileWriter;
import java.io.IOException;

public class fileWriter_7 {
    public static void main(String[] args) {
        String fileName = "java-nxt.txt";
        try (FileWriter writer = new FileWriter(fileName)){
            writer.write("This is the best java course.\n");

            for (int i = 0; i < 100; i++) {
                writer.write("*");
            }
            writer.flush();
            System.out.println("File Written Successful ");
        } catch (IOException e) {
            System.out.printf("Exception occurred %s",
                    e.getMessage());
        }
    }
}
