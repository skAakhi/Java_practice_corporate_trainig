public class Product {
  
    String productName;
    String productId;
    double price;
    int quantityAvailable;

    public Product(String productName, String productId, double price, int quantityAvailable) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
    }


    public String getDetails() {
        return "Product Name: " + productName + ", ID: " + productId + ", Price: " + price +" Rupees"+ ", Quantity Available: " + quantityAvailable;
    }


    public void updateQuantity(int quantity) {
        if (quantityAvailable >= quantity) {
            quantityAvailable -= quantity;
        } else {
            System.out.println("Not enough stock available!");
        }
    }
}