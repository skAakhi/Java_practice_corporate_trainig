

public class MethodTwo{

int x=20;
int y=30;

public static void main(String[] args)
{
MethodTwo m=new MethodTwo();
m.add();
}


void add()
{
sub(10,30);
System.out.printf("Adding of two values %d%n ",x+y);
}

void sub(int x,int y)
{
System.out.println("Multiplication of two values "+ mul());
System.out.println("Subtracting of two values "+Math.abs(x-y));
}

int mul()
{
System.out.println("Division of two values "+ div(10,20));
return x*y;
}

int div(int a,int b)
{
return a/b;
}

}



//--------------------------------------------------------------------------------------------------------->




class MethodTwoDotOne{

int x=20;
int y=30;

public static void main(String[] args)
{
MethodTwoDotOne m=new MethodTwoDotOne();
m.add();
}


void add()
{
this.sub(10,30);
System.out.printf("Hello Adding of two values %d%n ",x+y);
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








//----------------------------------------------------------------------------------------------------------->




class MethodTwoDotTwo{

int x=20;
int y=30;

public static void main(String[] args)
{
MethodTwoDotTwo m=new MethodTwoDotTwo();
m.add();
}


void add()
{
this.sub(10,30);
System.out.printf("Hello Adding of two values %d%n ",x+y);
}

void sub(int x,int y)
{
System.out.println("Multiplication of two values "+ this.mul());
System.out.println("Subtracting of two values "+Math.abs(x-y));
}

int mul()
{
System.out.println("Division of two values "+ this.div(10,20));
this.x=1;
this.y=5;
return x*y;
}

int div(int a,int b)
{
return a/b;
}

}
