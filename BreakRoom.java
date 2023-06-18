package Assignment2_000891023;

import java.util.Scanner;

import static Assignment2_000891023.VendingMachine.vendingmachine;

public class BreakRoom {
    public static void main(String[] args) {

        VendingMachine VendingMachine1 = new VendingMachine();
        VendingMachine1.Quantity = 10;
        VendingMachine1.Credit = 2.30;
        VendingMachine1.Balance = 20.38;

        VendingMachine VendingMachine2 = new VendingMachine();
        VendingMachine2.Quantity = 12;
        VendingMachine2.Credit = 0.00;
        VendingMachine2.Balance = 0.00;

        String Option = "";

        while (!Option.equals("4")) {

            System.out.println("Welcome to the Break Room!");

            System.out.println("");

            System.out.println("There are two vending machines available: ");

            System.out.println("Vending Machine #1: " + VendingMachine1.Quantity + " pack of chips, $1.25, " + "$" + VendingMachine1.Credit + ", " + "$" + VendingMachine1.Balance);

            System.out.println("Vending Machine #2: " + VendingMachine2.Quantity + " soda, $1.20, " + "$" + VendingMachine2.Credit + ", " + "$" + VendingMachine2.Balance);

            System.out.println("");

            System.out.println("What would you like to do?");

            System.out.println("");

            System.out.println("1. Insert money");

            System.out.println("2. Return change");

            System.out.println("3. Vend an item");

            System.out.println("4. Leave the break room");

            System.out.println("");

            System.out.println("Pick an option: ");

            Scanner sc = new Scanner(System.in);

            Option = sc.nextLine();

            vendingmachine(Option);
        }
    }
}

