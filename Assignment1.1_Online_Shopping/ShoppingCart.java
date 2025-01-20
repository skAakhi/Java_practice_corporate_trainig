public class ShoppingCart
{
Product[] cartItems=new Product[10];

int count=0;

public void addToCart(Product p)
{
if(count<cartItems.length){
cartItems[count++]=p;
System.out.println(p.productName+" Added to card");
}
else{
System.out.println("Sorry cart is full");
}
}


public void removeFromCart(String pid)
{
boolean flag=false;
for(int i=0;i<count;i++)
{
if(cartItems[i].productId.equals(pid))
{
for(int j=i;j<count-1;j++)
{
cartItems[j]=cartItems[j+1];
}
cartItems[--count]=null;

System.out.println("Product : " +pid+" removed from the cart");
flag=true;
}
}
if(!flag){
System.out.println("Product not found sorry try again");
}
}


public void viewCart()
{
if(count==0)
{
System.out.println("Your cart is empty");
}
else
{
double totalPrice=0;
for(int i=0;i<count;i++)
{
System.out.println(cartItems[i].productName+ "  " +cartItems[i].price);
totalPrice+=cartItems[i].price;
}
System.out.println("Total price : "+totalPrice);
}
}


public void checkOut()
{
double totalPrice=0;
for(int i=0;i<count;i++)
{
totalPrice+=cartItems[i].price;
cartItems[i].updateQuantity(1);
}
System.out.println("Total price after checkOut : "+totalPrice);
}

}









