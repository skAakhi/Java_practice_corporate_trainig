public class Product{

String productName;
String productId;
double price;
int quantityAvailable;

Product(String p_id,String p_name,double p, int qua_a)
{

this.productId=p_id;
this.productName=p_name;
this.price=p;
this.quantityAvailable=qua_a;
}

public String getDetails()
{
return "Product Id : "+productId+" Product Name : "+productName+" Product price : "+price+" Quantity : "+quantityAvailable;
}

public void updateQuantity(int i)
{
if(quantityAvailable>=i)
{
quantityAvailable=quantityAvailable-i;
}
else{
System.out.println("Sorry there is no stock available");
}
}

}




