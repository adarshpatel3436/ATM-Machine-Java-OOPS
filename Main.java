package ATMMachine;

import javax.xml.transform.Source;
import java.util.Scanner;

    class ATM{
        float Balance;
        int pin = 1234;

        public void checkpin(){
            System.out.print("Enter your pin: ");
            Scanner sc = new Scanner(System.in);
            int enteredpin = sc.nextInt();
            if(enteredpin==pin){
                menu();
            }else{
                System.out.println("Enter a Valid pin");
                checkpin();
            }
        }

        public void menu(){
            System.out.println("\n Enter your choice: ");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. EXIT \n ");
            System.out.print(":- ");
            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if(opt==1){
                checkBalance();
            } else if (opt == 2) {
                withdrawMoney();
            } else if (opt == 3) {
                depositMoney();
            } else if (opt == 4) {
                return;
            }else{
                System.out.println("\n Enter a valid choice");
                menu();
            }

        }

        public void checkBalance(){
            System.out.print("\n Your current Balance is: " + Balance);
            menu();
        }
        public void withdrawMoney(){
            Scanner sc = new Scanner(System.in);
            System.out.print("\n Enter Amount to withdraw: \n");
            float amount = sc.nextFloat();

            if(amount > Balance){
                System.out.println("\n Insufficient Balance");
            }else {
                Balance = Balance - amount;
                System.out.println(amount +" "+ "rs Withdrawl Successful");
            }
            menu();

        }

        public void depositMoney(){
            Scanner sc = new Scanner(System.in);
            System.out.print("\n Enter the amount: ");
            float amount = sc.nextFloat();

            Balance = Balance+amount;
            System.out.println("\n Money depositly Successful");
            menu();
        }

    }

    public class ATMMachine {
        public static void main(String[] args) {
            ATM obj = new ATM();
            obj.checkpin();
        }
    }
