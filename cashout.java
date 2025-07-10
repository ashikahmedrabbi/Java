import java.util.Scanner;

public class cashout {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        int balance = 25000;
        int pin = 1234;

        System.out.println("Cash Out Enter 1\n");
        System.out.println("Balance Check Enter 2\n");
        System.out.println("Logout Enter 3\n");
        System.out.println("What you Want: ");

        int x = myobj.nextInt();

        switch (x) {
            case 1:
                System.out.println("Enter Your Pin ");
                int pass = myobj.nextInt();
                if (pin == pass) {
                    System.out.println("Enter Your Amount ");
                    int amount = myobj.nextInt();
                        if (amount <= balance) {
                            System.out
                                    .println("Cash Out SuccessFull " + amount + "\nYour balance is Now "
                                            + (balance - amount));
                            break;
                        }

                        else {
                            System.out.println("Insaficient Balance");
                        }
                }

                else {
                    System.out.println("Increct Pin");
                    break;
                }
            case 2:
                System.out.println("Enter Your Pin ");
                pass = myobj.nextInt();
                if (pin == pass) {
                    System.out.println("Your Balance is : " + balance);
                    break;
                }

                else {
                    System.out.println("Increct Pin");
                    break;
                }

            case 3:
                System.out.println("Logout Successfull");
                break;
        }
    }
}



