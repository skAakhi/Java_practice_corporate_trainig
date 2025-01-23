
import java.util.*;
public class Main{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Logic i = new Logic();
boolean flag=true;
try{
while(flag)
{
System.out.printf("\n 1 - To ADD\n 2- To deleteByIndex\n 3- To delete all elements\n 4- Fetch current elements\n 5- To exit : \n");
int opt = sc.nextInt();
switch(opt)
{
case 1 : i.add();
break;
case 2 : 
System.out.println("Enter index to delete element from your list : ");
int index = sc.nextInt();
i.deleteByIndex(index-1);
break;
case 3 : i.delete();
break;
case 4 : i.fetch();
break;
case 5 : 
i.closeResource();
System.out.println("Code exits...Thank you ! ");
flag=false;
break;
default : throw new InvalidChoiceException("Wrong Option please try again ! ");
}
}
}
catch(InvalidChoiceException e)
{
System.out.println(e.getMessage());
}
catch(IndexOutOfBoundsException e)
{
System.out.println(e.getMessage());
}
finally{
sc.close();
}
}
}

