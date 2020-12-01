import java.util.HashMap;
import java.util.Scanner;

public class HDCF {
    static HashMap<String, String> hashMap = new HashMap<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to HDFC bank");
        System.out.println("1->SignUp  \n 2-> Login ");
        String s = scan.next();
        if (s.equals("1")) {
            System.out.println("Enter");
            System.out.print("1-> Customer  \n 2-> Admin ");
            String l = scan.next();
            if (l.equals("1")) {
                enterDetails();
            } else {
                enterDetails();
            }
        } else if (s.equals("2")) {
            System.out.println("1-> Customer  / 2-> Admin ");
            String a = scan.next();
            if (a.equals("1")) {
                //enterDetails();//loggin page for customer
            } else {
                //enterDetails();
            }
        }
    }
    private static void enterDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1-> Create an account  \n 2-> exit ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
//                System.out.println("1-> Create Account");
//                System.out.println("2-> Enter ");
                System.out.println("Create account");
                System.out.println("Enter Name");
                String name = scanner.next();
                System.out.println("Enter new password");
                String newPassword = scanner.next();
                hashMap.put("password", newPassword);
                System.out.println("Enter account number");
                String accountNumber = scanner.next();
                hashMap.put("accountNumber", accountNumber);
                System.out.println("Enter the starting balance");
                String startingBalance = scanner.next();
                hashMap.put("startingBalance", startingBalance);
                System.out.println("Enter role (Customer or Employee)");
                String role = scanner.next();
                if (role.equals("Customer")) {
                    CustomerLogin customerLogin = new CustomerLogin(hashMap.get("password"), hashMap.get("accountNumber"),
                            hashMap.get("startingBalance"));
            //    } else if (role.equals("Employee")) {
//                    EmployeeLogin employeeLogin = new EmployeeLogin();
//                    employeeLogin.employeeLogin();
                }
                break;
//            case 2:
//                System.out.println("Login");
//                System.out.println("Enter account number");
//                String loginAccount = scanner.next();
//                System.out.println("Enter password (minimum 8 characters)");
//                String loginPassword = scanner.next();
//                EmployeeLogin employeeLogin = new EmployeeLogin();
//                if (employeeLogin.validateEmployeeCredentials(loginAccount, loginPassword)) {
//                    employeeLogin.employeeLogin();
//                } else {
//                    System.out.println("Please enter a valid password");
//                }
//                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

}
