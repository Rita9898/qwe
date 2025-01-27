import java.io.*;
import java.util.Scanner;

public class file1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("rita.txt: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String content = reader.lines().reduce("", (acc, line) -> acc + " " + line);
            String[] words = content.trim().split("\\s+");
            System.out.println("Сөздердің саны: " + words.length);
        } catch (FileNotFoundException e) {
            System.out.println("Файл табылмады.");
        } catch (IOException e) {
            System.out.println("Файлды оқу кезінде қате болды.");
        }
    }
}