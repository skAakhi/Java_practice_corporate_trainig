import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class ListOne{

public static void main(String[] args)
{
int sum=0;
//Collection c = new ArrayList();
List<Integer> c = new ArrayList<>();

c.add(1);
c.add(2);
c.add(3);
//c.add("Aakhib");
c.add(5);

System.out.println(c);

for(Object o : c){
System.out.print(o+" ");
sum+=(Integer)o;
}
System.out.println();
System.out.println("Sum of all "+ sum);

System.out.println();

Iterator i = c.iterator();//------------------->hasNext()[boolean] , next()[Object]

while(i.hasNext())
System.out.println(i.next());


}

}










class ListTwo{

public static void main(String[] args)
{
int sum=0;
List<Integer> c = new ArrayList<>();
List<Integer> c1 = new ArrayList<>();

c.add(1);
c.add(2);
c.add(3);

c1.add(4);
c1.add(5);
c1.add(6);


System.out.println(c);
System.out.println(c.addAll(c1));
System.out.println(c);
}

}


