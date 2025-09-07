import java.io.FileReader;
import java.io.IOException;

public class fileReader_8 {
    public static void main(String[] args) {
        String fileRead = "java-nxt.txt  ";

        try(FileReader reader  = new FileReader(fileRead)) {
            int read = 0;
            do {
                read = reader.read();
                System.out.print((char)read);
            }while (read != -1);
        } catch (IOException e) {
            System.out.printf("Exception occurred: %s",
                    e.getMessage());
        }
    }
}
