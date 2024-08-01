import java.util.Scanner;

public class Admin {
    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Admin Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine();

        return Utilities.authenticate(username, password);

    }

    public void Menu(int choice) {
        if(choice == 1){
            System.out.println("Welcome, Admin!");

        }
        else{
            System.out.println("Welcome, User!");
        }
        // Admin-specific functionalities can be added here.
//        StudentActivities s =  new StudentActivities();
        StudentActivities.activities(choice);
    }
}
