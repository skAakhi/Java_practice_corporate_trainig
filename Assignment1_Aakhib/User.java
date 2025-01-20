public class User {
    String username;
    ShoppingCart shoppingCart;

   
    public User(String username) {
        this.username = username;
        this.shoppingCart = new ShoppingCart();
    }


    public void addItemToCart(Product product) {
        shoppingCart.addToCart(product);
    }


    public void removeItemFromCart(String productId) {
        shoppingCart.removeFromCart(productId);
    }

  
    public void viewShoppingCart() {
        shoppingCart.viewCart();
    }

    
    public void checkout() {
        shoppingCart.checkout();
    }
}