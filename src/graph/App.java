//file App.java
// file for the INTERFACE 

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Graph graph = new Graph();



        while (true) {
            ASCIIArt.printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter username to add: ");
                    String newUser = scanner.nextLine();
                    graph.addUser(newUser);
                    break;

                case "2":
                    System.out.print("Enter first user: ");
                    String u1 = scanner.nextLine();
                    System.out.print("Enter second user: ");
                    String u2 = scanner.nextLine();
                    graph.addFriendship(u1, u2);
                    break;

                case "3":
                    System.out.print("Enter username to view friends: ");
                    String viewUser = scanner.nextLine();
                    graph.displayFriends(viewUser);
                    break;

                case "4":
                    System.out.print("Enter username for suggestions: ");
                    String sugUser = scanner.nextLine();
                    graph.suggestFriends(sugUser);
                    break;

                case "5":
                    System.out.print("Enter starting user: ");
                    String start = scanner.nextLine();
                    System.out.print("Enter target user: ");
                    String end = scanner.nextLine();
                    graph.shortestPath(start, end);
                    break;

                case "6":
                    System.out.print("Enter first user: ");
                    String m1 = scanner.nextLine();
                    System.out.print("Enter second user: ");
                    String m2 = scanner.nextLine();
                    graph.mutualFriends(m1, m2);
                    break;

                case "7":
                    System.out.print("Enter username to remove: ");
                    String removeUser = scanner.nextLine();
                    graph.removeUser(removeUser);
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