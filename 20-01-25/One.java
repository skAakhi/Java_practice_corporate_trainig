interface one{
int a=10;
void x();
void y();
}

class A implements one{

public void x()
{
System.out.println("Inside A class x logic");
}

public static void main(String[] args)
{
one i=new A();
i.x();
}
}


//Note:should be public for x() method othewise ,
//C:\Users\HP\Desktop\Java_practice\20-01-25>javac one.java
//one.java:8: error: x() in A cannot implement x() in one
//void x()
  //   ^
  //attempting to assign weaker access privileges; was public
//1 error
