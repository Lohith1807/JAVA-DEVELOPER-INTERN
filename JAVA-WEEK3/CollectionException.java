import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CollectionException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        set.add("apple");
        set.add("banana");
        set.add("apple");
        map.put("apple", 1);
        map.put("banana", 2);
        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
        System.out.println("HashMap: " + map);
        System.out.print("Enter key to find count: ");
        String key = scanner.nextLine();
        try {
            if (!map.containsKey(key)) {
                throw new DataNotFoundException(key + " not found");
            }
            int value = map.get(key);
            System.out.println("Found " + key + " count " + value);
            System.out.print("Enter index for list lookup: ");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("List item: " + list.get(index));
        } catch (DataNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Enter a number only");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        } finally {
            System.out.println("Demo finished");
            scanner.close();
        }
    }
}

class DataNotFoundException extends Exception {
    public DataNotFoundException(String message) {
        super(message);
    }
}
