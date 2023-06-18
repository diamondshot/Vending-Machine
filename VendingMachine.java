package Assignment2_000891023;

import java.util.Scanner;

public class VendingMachine {

    static int Quantity;

    static double Credit;

    static double Balance;

    static String Option = "";

    static Scanner sc = new Scanner(System.in);

    public static void vendingmachine(String Option) {

        if (Option.equals("1")) {
            System.out.println("*** INSERT MONEY ***");
            System.out.println("");
            System.out.println("Enter an amount: ");
            int Amount = sc.nextInt();
            System.out.println("");
            System.out.println("Pick a machine: ");
            String machine = sc.nextLine();

            if (machine.equals("1")) {
                Credit += Amount;
                System.out.println("*** MONEY INSERTED SUCCESSFULLY ***");
            }

            else if (machine.equals("2")) {
                Credit += Amount;
                System.out.println("*** MONEY INSERTED SUCCESSFULLY ***");
            }
        }

        else if (Option.equals("2")) {
            System.out.println("*** RETURN CHANGE ***");
        }

        else if (Option.equals("3")) {
            System.out.println("*** VEND AN ITEM ***");
            System.out.println("");
            System.out.println("Pick a machine: ");
            String machine = sc.nextLine();

            if (machine.equals("1")) {

                if ((Credit >= 1.25) && (Quantity >= 1)) {
                    Credit -= 1.25;
                    Quantity -= 1;
                    System.out.println("*** VEND SUCCESSFUL ***");
                }

                else {
                    System.out.println("*** VEND FAILED: Not enough credit or out of stock ***");
                }
            }

            if (machine.equals("2")) {

                if ((Credit >= 1.20) && (Quantity >= 1)) {
                    Credit -= 1.20;
                    Quantity -= 1;
                    System.out.println("*** VEND SUCCESSFUL ***");
                }

                else {
                    System.out.println("*** VEND FAILED: Not enough credit or out of stock ***");
                }
            }
        }
    }

}

