import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement manager = new EmployeeManagement();

        try {
            System.out.println("Enter details to add an employee:");
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Extension: ");
            String extension = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Job Title (e.g., Sales Rep, Sales Manager): ");
            String jobTitle = scanner.nextLine();

            System.out.print("Employee Type (S for Sales Rep, N for Manager): ");
            String employeeType = scanner.nextLine();

            System.out.print("Is Deactivated (0 for no, 1 for yes): ");
            int isDeactivated = scanner.nextInt();
            scanner.nextLine(); // consume the leftover newline

            System.out.print("End Username: ");
            String endUsername = scanner.nextLine();

            System.out.print("End User Reason: ");
            String endUserReason = scanner.nextLine();

            manager.addEmployee(lastName, firstName, extension, email, jobTitle, employeeType, isDeactivated, endUsername, endUserReason);
            System.out.println("Employee added successfully.");
        } catch (SQLException e) {
            System.err.println("Error adding employee: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Input error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
