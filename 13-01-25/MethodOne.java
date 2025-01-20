

public class MethodOne{

int x=20;
int y=30;

public static void main(String[] args)
{
MethodOne m=new MethodOne();
m.add();
m.sub(10,39);
int i=m.mul();
System.out.printf("Multiplication of two values %d%n",i);
int j=m.div(20,10);
System.out.printf("Division of two values %d%n",j);

}


void add()
{
System.out.printf("Adding of two values %d%n",x+y);
}

void sub(int x,int y)
{
System.out.println("Subtracting of two values"+Math.abs(x-y));
}

int mul()
{
return x*y;
}

int div(int a,int b)
{
System.out.println("Division of two values");
return a/b;
}

}
