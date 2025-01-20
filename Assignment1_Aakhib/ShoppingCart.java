public class ShoppingCart {
    
    Product[] cartItems = new Product[10];
    int itemCount = 0; 

   
    public void addToCart(Product product) {
        if (itemCount < 10) {
            cartItems[itemCount++] = product;
            System.out.println(product.productName + " added to the cart.");
        } else {
            System.out.println("Cart is full! Cannot add more products.");
        }
    }

   
    public void removeFromCart(String productId) {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].productId.equals(productId)) {
                
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[--itemCount] = null;
                System.out.println("Product with ID " + productId + " removed from the cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product with ID " + productId + " not found in the cart.");
        }
    }

   
    public void viewCart() {
        if (itemCount == 0) {
            System.out.println("Your cart is empty.");
        } else {
            double totalPrice = 0;
            System.out.println("Your Cart:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(cartItems[i].getDetails());
                totalPrice += cartItems[i].price;
            }
            System.out.println("Total Price: $" + totalPrice);
        }
    }

   
    public void checkout() {
        double totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            totalPrice += cartItems[i].price;
            cartItems[i].updateQuantity(1); 
        }
        System.out.println("Checkout completed. Total Price: $" + totalPrice);
    }
}