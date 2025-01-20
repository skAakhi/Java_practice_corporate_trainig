public class Store {
    Product[] products = new Product[10];
    int productCount = 0;

  
    public void addProduct(Product product) {
        if (productCount < 10) {
            products[productCount++] = product;
            System.out.println(product.productName + " added to the store.");
        } else {
            System.out.println("Store inventory is full!");
        }
    }

   
    public void removeProduct(String productId) {
        boolean found = false;
        for (int i = 0; i < productCount; i++) {
            if (products[i].productId.equals(productId)) {
                // Shift items to remove the product
                for (int j = i; j < productCount - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[--productCount] = null;
                System.out.println("Product with ID " + productId + " removed from the store.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product with ID " + productId + " not found in the store.");
        }
    }

   
    public void viewProducts() {
        if (productCount == 0) {
            System.out.println("No products available in the store.");
        } else {
            System.out.println("Available Products:");
            for (int i = 0; i < productCount; i++) {
                System.out.println(products[i].getDetails());
            }
        }
    }

    
    public User createUser(String username) {
        return new User(username);
    }

  
    public User login(String username) {
        return new User(username); 
    }
}