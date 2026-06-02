import java.util.*;

class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CollectionsDemo {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid Age");
    }

    public static void main(String[] args) {

        // ArrayList Example
        ArrayList<String> students = new ArrayList<>();
        students.add("Isha");
        students.add("Rahul");
        students.add("Aman");

        System.out.println("ArrayList:");
        for (String student : students) {
            System.out.println(student);
        }

        // HashMap Example
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Isha");
        studentMap.put(102, "Rahul");

        System.out.println("\nHashMap:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // HashSet Example
        HashSet<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("Java"); // Duplicate ignored

        System.out.println("\nHashSet:");
        for (String course : courses) {
            System.out.println(course);
        }

        // Try-Catch Example
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("\nException Caught: " + e.getMessage());
        }

        // Custom Exception Example
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
} 
