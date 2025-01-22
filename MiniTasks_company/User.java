package MiniTasks_company;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
	        PizzaOrderSystem system = new PizzaOrderSystem();
	        Scanner scanner = new Scanner(System.in);
	        boolean running = true;

	        while (running) {
	            system.displayMenu();
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                case 2:
	                case 3:
	                case 4:system.placeOrder(choice);
	                break;
	                case 5 : system.checkout();
	                case 6 : 
	                    System.out.println("Exiting... Goodbye!");
	                    running = false;
	                break;
	                default : System.out.println("Invalid choice! Please try again.");
	            }
	        }

	        scanner.close();
	    }

	}


