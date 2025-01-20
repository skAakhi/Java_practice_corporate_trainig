public class Main{

public static void main(String[] args)
{

Product p1=new Product("11","Hp",1000,10);
Product p2=new Product("12","Lenovo",500,20);
Product p3=new Product("13","Dell",2000,10);


Store s=new Store();

s.addProduct(p1);
s.addProduct(p2);
s.addProduct(p3);

//s.viewProducts();

//s.removeProduct("12");

s.viewProducts();
//------------------------------------------>Login access
User u1=s.createUser("Aakhib");
u1.printUser();
//try{
//u1=s.Login("Aakhib");
//System.out.println("Welcome "+u1.username);
//}
//catch(Exception e){

//System.out.println(e.getMessage());
//}
//--------------------------------------------->
ShoppingCart sc=new ShoppingCart();
//sc.addToCart(p1);

u1.addItemToCart(p1);
u1.addItemToCart(p2);
u1.viewShoppingCart();
//u1.removeItemFromCart("11");
//u1.viewShoppingCart();
u1.checkOut();
s.viewProducts();

}


}