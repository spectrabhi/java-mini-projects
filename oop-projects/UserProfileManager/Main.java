import java.util.Scanner;
// import oop.User;


public class Main {
    public static void main(String[] args) {
        // Create a new User object
        Scanner scanner = new Scanner(System.in);

        // Prompt user for details
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt(); // Clear Buffer
        scanner.nextLine(); // Consume newline left-over

        User user = new User(name, email, age);

        // Show user profile
        System.out.println("\nUser created successfully!");
        user.displayProfile();
        
        // Update user details
        System.out.print("\nUpdate name: ");
        String newName = scanner.nextLine();
        user.setName(newName);  

        System.out.println(newName + " has been set as the new name.");

        scanner.close();
    }
}
