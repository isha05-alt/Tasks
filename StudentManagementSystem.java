import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String[] students = new String[10];
            int count = 0;
            int choice;
            
            do {
                System.out.println("\nStudent Management System ");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Search Student");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                
                choice = sc.nextInt();
                sc.nextLine();
                
                switch (choice) {
                    
                    case 1:
                        if (count < students.length) {
                            System.out.print("Enter Student Name: ");
                            students[count] = sc.nextLine();
                            count++;
                            System.out.println("Student Added Successfully!");
                        } else {
                            System.out.println("Student List Full!");
                        }
                        break;
                        
                    case 2:
                        if (count == 0) {
                            System.out.println("No Students Found!");
                        } else {
                            System.out.println("\nStudent List:");
                            for (int i = 0; i < count; i++) {
                                System.out.println((i + 1) + ". " + students[i]);
                            }
                        }
                        break;
                        
                    case 3:
                        System.out.print("Enter Student Name to Search: ");
                        String search = sc.nextLine();
                        
                        boolean found = false;
                        
                        for (int i = 0; i < count; i++) {
                            if (students[i].equalsIgnoreCase(search)) {
                                System.out.println("Student Found!");
                                found = true;
                                break;
                            }
                        }
                        
                        if (!found) {
                            System.out.println("Student Not Found!");
                        }
                        break;
                        
                    case 4:
                        System.out.println("Exiting Program...");
                        break;
                        
                    default:
                        System.out.println("Invalid Choice!");
                }
                
            } while (choice != 4);
        }
    }
} 
