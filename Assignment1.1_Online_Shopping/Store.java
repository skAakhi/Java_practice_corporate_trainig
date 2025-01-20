public class Store{


Product[] items=new Product[100];
User[] users=new User[10];

int count=0;
int userCount=0;
public void addProduct(Product p)
{
if(count<items.length)
{
items[count++]=p;
}
else
{
System.out.println("Sorry no enough space your store");
}
}


public void removeProduct(String pid)
{
boolean flag=false;
for(int i=0;i<count;i++){
if(items[i].productId.contains(pid))
{
for(int j=i;j<count;j++)
{
items[j]=items[j+1];
}
items[--count]=null;
System.out.println("Product : " +pid+" removed from the store");
flag=true;
}
}
if(!flag)
System.out.println("Product not found sorry try again");
}



public void viewProducts()
{
if(count==0)
{
System.out.println("No Products available");
}
else{
System.out.println("Inventory products :");
for(int i=0;i<count;i++)
{
//System.out.println("Product id : "+items[i].productId+" Product name : "+items[i].productName+ " Product price : " +items[i].price+" Quantity : "+items[i].quantityAvailable);
System.out.println(items[i].getDetails());
}
}
}




public User createUser(String name) {

if(userCount<users.length)
{
users[userCount]=new User(name);
System.out.println("User created : "+ name);  
return users[userCount++];  
}
else{
System.out.println("User limit breached cannot create more users");
return null;
}
}



public User Login(String name) throws Exception
{ 
for(int i=0;i<userCount;i++)
{
if(users[i]!=null && users[i].username.equals(name)){
System.out.println("Login sucessfull ");
return users[i];
}
}
throw new Exception("Invalid credentials");
}

}




