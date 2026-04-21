package Stream_02.BtyeVsCharacters_02;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

public class Example {
    public static void main(String[] args) {
        String fileName = "notes.txt";

        // Step 1: Create a sample UTF-8 file (only for demo purpose)
        try (Writer writer = new OutputStreamWriter(
                new FileOutputStream(fileName), StandardCharsets.UTF_8)) {
            writer.write("Hello, World!\n");
            writer.write("नमस्ते, こんにちは");

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
