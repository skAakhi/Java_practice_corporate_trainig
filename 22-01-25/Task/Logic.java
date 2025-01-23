
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Logic 
{

List<String> l = new ArrayList<>();
Scanner sc = new Scanner(System.in);


public void add()
{
System.out.println("Enter the number of items that you want to add : ");
int count = sc.nextInt();
for(int i=0;i<count;i++)
{
System.out.printf("Enter %d item : ", i+1);
l.add(sc.next());
}
System.out.print("Your list of items : ");
System.out.println(l);
}



public void deleteByIndex(int i) throws IndexOutOfBoundsException
{
if(i>=0 && i<l.size())
{
l.remove(i);
System.out.printf("Value at %d removed ",i); 
}
else{
throw new IndexOutOfBoundsException("Wrond index");
}
}



public void delete()
{
l.clear();
System.out.println("All items removed");
}



public void fetch()  throws IndexOutOfBoundsException
{
if(l.isEmpty())
{
throw new IndexOutOfBoundsException("There is no elements please check again ");
}
else{
for(String i : l)
System.out.print(i+" ");
}
}

}
















