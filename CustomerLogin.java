import java.util.Scanner;

public class CustomerLogin {
    Scanner scanner = new Scanner(System.in);
    CustomerLogin(String password, String accountNumber, String startingBalance) {
        System.out.println("Login successful, you are an HDFC customer.");
        System.out.println("Enter your choice");
        System.out.println("1->Deposit ");
        System.out.println("2->Withdraw money ");
        System.out.println("3->Transfer ");
        System.out.println("4->Total balance ");
        int no = scanner.nextInt();
        int amount = Integer.parseInt(startingBalance);
        switch (no) {
            case 1:
                System.out.println("Enter the amount to deposit");
                int enteredAmount = scanner.nextInt();
                amount = amount + enteredAmount;
                System.out.println("Your total balance is:" + amount);
                break;
            case 2:
                System.out.println("Enter the amount to withdraw");
                int enteredWithdraw = scanner.nextInt();
                amount = amount - enteredWithdraw;
                System.out.println("Your total balance is:" + amount);
                break;
            case 4:
                System.out.println("Your total balance is:" + amount);
        }
    }

}
