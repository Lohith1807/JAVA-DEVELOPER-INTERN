import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {
    private static final String DATA_FILENAME = "data.txt";

    public static void main(String[] args) {
        try {
            writeSampleData();
            System.out.println("Sample data written to " + DATA_FILENAME + ".\n");

            System.out.println("=== Read file contents ===");
            readData();

            appendData("orange");
            System.out.println("\nAppended new item to " + DATA_FILENAME + ".\n");

            System.out.println("=== Read file contents after append ===");
            readData();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    private static void writeSampleData() throws IOException {
        try (FileWriter writer = new FileWriter(DATA_FILENAME)) {
            writer.write("apple\n");
            writer.write("banana\n");
            writer.write("cherry\n");
        }
    }

    private static void appendData(String item) throws IOException {
        try (FileWriter writer = new FileWriter(DATA_FILENAME, true)) {
            writer.write(item + "\n");
        }
    }

    private static void readData() throws IOException {
        try (FileReader reader = new FileReader(DATA_FILENAME);
             BufferedReader buffered = new BufferedReader(reader)) {
            String line;
            int lineNumber = 1;
            while ((line = buffered.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        }
    }
}
