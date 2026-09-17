package Exercise211;

import java.util.Scanner;

public class mainExercise211{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount (from 1 - 99 cents): ");
        int amount = input.nextInt();

        int quarter = amount / 25;
        amount = amount % 25;

        int dime = amount / 10;
        amount = amount % 10;

        int nickel = amount / 5;
        amount = amount % 5;

        int penny = amount;

        System.out.println("Your change is");
        System.out.println(quarter + " quarter");
        System.out.println(dime + " dime");
        System.out.println(nickel + " nickel");
        System.out.println(penny + " penny");

        input.close();
    }
}