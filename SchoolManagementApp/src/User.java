import java.util.Scanner;

public class User {

    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        return Utilities.authenticate(username, password);

    }

    public void Menu(int choice) {
        System.out.println("Welcome, User!");
        // Admin-specific functionalities can be added here.
        StudentActivities.activities(choice);
    }
}