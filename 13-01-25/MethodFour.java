public class MethodFour{

 static int x=20;
 static int y=30;

public static void main(String[] args)
{
add();

}


static void add()
{
sub(10,30);
System.out.printf("Adding of two values %d%n ",x+y);
}

static void sub(int x,int y)
{
System.out.println("Multiplication of two values "+ new MethodFour().mul());
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









//---------------------------------------------------------------------------------------------------------------->



class MethodFourDotOne{

 static int x=20;
 static int y=30;

public static void main(String[] args)
{
MethodFourDotOne m= new MethodFourDotOne();
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

static int mul()
{
System.out.println("Division of two values "+ div(10,20));
return x*y;
}

static int div(int a,int b)
{
return a/b;
}

}









//-------------------------------------------------------------------------------------------------------------------->




class MethodFourDotTwo{

 static int x=20;
 static int y=30;

public static void main(String[] args)
{
MethodFourDotTwo.add();

//(or)

add();

}


static void add()
{
sub(10,30);
System.out.printf("Adding of two values %d%n ",x+y);
}

static void sub(int x,int y)
{
System.out.println("Multiplication of two values "+ mul());
System.out.println("Subtracting of two values "+Math.abs(x-y));
}

static int mul()
{
System.out.println("Division of two values "+ new MethodFourDotTwo().div(10,20));
return x*y;
}

int div(int a,int b)
{
return a/b;
}

}




