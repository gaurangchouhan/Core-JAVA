package Exercise17ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class problem88FileReader{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileReader = sc.next();

        try (FileReader reader = new FileReader(fileReader)){
            int read;
            while ((read = reader.read()) != -1 ){
                System.out.println((char) read);
            }
         } catch (FileNotFoundException e) {
            System.out.printf("%s not found", fileReader);
        } catch (IOException e){
            System.out.printf("Exception occurred %s",
                    e.getMessage());
        }
    }
}
