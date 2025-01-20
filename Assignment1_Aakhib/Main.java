public class Main {
    public static void main(String[] args) {
        
        Store store = new Store();

     
        Product product1 = new Product("Laptop", "P001", 1000.0, 5);
        Product product2 = new Product("Smartphone", "P002", 500.0, 10);
        Product product3 = new Product("Headphones", "P003", 100.0, 20);
      

       System.out.println();
        
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

       System.out.println();
     
       store.viewProducts();

       
        System.out.println();

        User user = store.createUser("Alice");

        System.out.println();

        user.addItemToCart(product1);
        user.addItemToCart(product2);

  

        System.out.println();

        store.viewProducts();

       
        System.out.println();

       
        user.viewShoppingCart();
        
        System.out.println();

         user.removeItemFromCart("P001");

          System.out.println();

       
          user.checkout();
    
          System.out.println();

       
        store.viewProducts();
    }
}

