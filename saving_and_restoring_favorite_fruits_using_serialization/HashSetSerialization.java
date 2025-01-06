package jan_06.saving_and_restoring_favorite_fruits_using_serialization;

import java.io.*;
import java.util.HashSet;

public class HashSetSerialization {

    public static void serializeHashSet(HashSet<String> set, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(set);
            System.out.println("HashSet serialized successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during serialization: " + e.getMessage());
        }
    }

    public static HashSet<String> deserializeHashSet(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            @SuppressWarnings("unchecked")
            HashSet<String> set = (HashSet<String>) ois.readObject();
            System.out.println("HashSet deserialized successfully.");
            return set;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization: " + e.getMessage());
        }
        return new HashSet<>();
    }

    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Banana");

        String filename = "C:\\Users\\milin\\OneDrive\\Desktop\\Test.txt";

        // Serialize the HashSet
        serializeHashSet(fruits, filename);

        // Deserialize the HashSet
        HashSet<String> deserializedFruits = deserializeHashSet(filename);

        // Display the deserialized HashSet
        if (deserializedFruits.isEmpty()) {
            System.out.println("The deserialized HashSet is empty.");
        } else {
            System.out.println("Deserialized HashSet: " + deserializedFruits);
        }
    }
}
