// file for the INTERFACE 

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            ASCIIArt.printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Add User selected.");
                    break;
                case "2":
                    System.out.println("Add Friendship selected.");
                    break;
                case "3":
                    System.out.println("View Friends List selected.");
                    break;
                case "4":
                    System.out.println("Friend Suggestions selected.");
                    break;
                case "5":
                    System.out.println("Degrees of Separation selected.");
                    break;
                case "6":
                    System.out.println("Mutual Friends selected.");
                    break;
                case "7":
                    System.out.println("Remove User selected.");
                    break;
                case "8":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}