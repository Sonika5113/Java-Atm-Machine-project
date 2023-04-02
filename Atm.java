import java.util.Scanner;
public class Atm {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int balance = 100000;
      int withdraw,deposit;
      int pin = 1234;
      boolean loggedIn =false;
      System.out.print("Enter your PIN: ");
      int enteredPin = scanner.nextInt();
      
      // Validate PIN
      if (enteredPin == pin) {
          System.out.println("Login successful!");
          loggedIn = true;
      } 
      else
      {
          System.out.println("Invalid PIN. Please try again later.");
      }
      while (true) {
         System.out.println("Welcome to the ATM machine");
         System.out.println("1. Withdraw Money");
         System.out.println("2. Deposit Money");
         System.out.println("3. Check Balance");
         System.out.println("4. Quit");

         int choice = scanner.nextInt();
         switch (choice) {
            case 1:
               System.out.println("Enter amount to withdraw:");
               withdraw = scanner.nextInt();
               if (balance >= withdraw) {
                  balance -= withdraw;
                  System.out.println("You have withdrawn " + withdraw + " rupees.");
               } else {
                  System.out.println("Insufficient balance");
               }
               break;

            case 2:
               System.out.println("Enter amount to deposit:");
               deposit = scanner.nextInt();
               balance += deposit;
               System.out.println("You have deposited " + deposit + " rupees.");
               break;

            case 3:
               System.out.println("Your balance is " + balance + " rupees.");
               break;

            case 4:
               System.out.println("Thank you for using the ATM machine");
               System.exit(0);

            default:
               System.out.println("Invalid choice");
         }
      }
   }
}
