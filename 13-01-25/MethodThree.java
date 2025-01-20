

public class MethodThree{

int x=20;
int y=30;

public static void main(String[] args)
{
MethodThree m=new MethodThree();
m.add();
}


void add()
{
new MethodThree().sub(10,30);
System.out.printf("Adding of two values %d%n ",x+y);
}

void sub(int x,int y)
{
System.out.println("Multiplication of two values "+ new MethodThree().mul());
System.out.println("Subtracting of two values "+Math.abs(x-y));
}

int mul()
{
System.out.println("Division of two values "+ new MethodThree().div(10,20));
return x*y;
}

int div(int a,int b)
{
return a/b;
}

}







//---------------------------------------------------------------------------------------------------------->





class MethodThreeDotOne{

int x=20;
int y=30;

public static void main(String[] args)
{
MethodThreeDotOne m=new MethodThreeDotOne();
m.add();
}


void add()
{
new  MethodThreeDotOne().sub(10,30);
System.out.printf("Adding of two values %d%n ",x+y);
}

void sub(int x,int y)
{
System.out.println("Multiplication of two values "+ this.mul());
System.out.println("Subtracting of two values "+Math.abs(x-y));
}

int mul()
{
System.out.println("Division of two values "+ this.div(10,20));
return x*y;
}

int div(int a,int b)
{
return a/b;
}

}






