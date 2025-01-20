public class User
{
String username;

ShoppingCart sc;


User(String name)
{
this.username=name;
this.sc=new ShoppingCart();
}


public void addItemToCart(Product p){  sc.addToCart(p);   }

public void removeItemFromCart(String pid) { sc.removeFromCart(pid);  }


public void viewShoppingCart() {  sc.viewCart(); }

public void checkOut() {  sc.checkOut();  }

public void printUser() { System.out.println("User Name : "+this.username); }

}











