import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] alphabet = {"A a", "B b", "C c", "D d", "E e",
                "F f", "G g", "H h", "I i", "J j", "K k", "L l", "M m",
                "N n", "O o", "P p", "Q q", "R r", "S s", "T t", "U u",
                "V v", "W w", "X x", "Y y", "Z z",};
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        try (FileWriter writer = new FileWriter("Alphabet and numbers.txt")) {
            for (String s : alphabet) {
                writer.write(s + "\n");
            }
            for (int i : numbers) {
                writer.write(i + "\n");
            }
            writer.close();
        }

        try (FileReader reader = new FileReader("Alphabet and numbers.txt")) {
            Scanner scanner = new Scanner(reader);
            int count = 1;
            while (scanner.hasNextLine()) {
                System.out.println(count + ": " + scanner.nextLine());
                count++;
            }
        }
    }
}