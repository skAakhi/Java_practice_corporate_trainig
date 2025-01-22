package MiniTasks_company;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrderSystem {
	
	 private final List<Pizza> menu = new ArrayList<>();
	    private final List<Pizza> order = new ArrayList<>();

	    public PizzaOrderSystem() {
	        // Initialize menu with different pizzas
	        menu.add(new MargheritaPizza());
	        menu.add(new ChickenPizza());
	        menu.add(new VeggiePizza());
	        menu.add(new PannerPizza());
	    }

	    public void displayMenu() {
	        System.out.println("\nMenu:");
	        for (int i = 0; i < menu.size(); i++) {
	            Pizza pizza = menu.get(i);
	            System.out.printf("%d. %s - %.2fRs%n", i + 1, pizza.getName(), pizza.getPrice());
	        }
	        System.out.println("5. Checkout");
	        System.out.println("6. Exit");
	    }

	    public void placeOrder(int choice) {
	        try {
	            switch (choice) {
	                case 1 : order.add(new MargheritaPizza());
	                break;
	                case 2 : order.add(new ChickenPizza());
	                break;
	                case 3 : order.add(new VeggiePizza());
	                break;
	                case 4:order.add(new PannerPizza());
	                default : throw new InvalidChoiceException("Invalid choice! Please select a valid menu option.");
	            }
	            System.out.println("Added to order: " + menu.get(choice - 1).getName());
	        } catch (InvalidChoiceException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public void checkout() {
	        if (order.isEmpty()) {
	            System.out.println("Your order is empty. Please add items to your order.");
	            return;
	        }

	        double total = 0;
	        System.out.println("\nYour Order:");
	        for (Pizza pizza : order) {
	            System.out.printf("%s - %.2fRs%n", pizza.getName(), pizza.getPrice());
	            total += pizza.getPrice();
	        }
	        System.out.printf("Total: %.2fRs%n", total);
	        System.out.println("Thank you for your order!");
	        order.clear();
	    }
	}


