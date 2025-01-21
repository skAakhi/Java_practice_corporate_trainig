class A{

private void x()
{
System.out.println("Hai");
}
}

class B extends A
{
void x()
{
System.out.println("Hello");
}

public static void main(String[] args)
{
B b = new B();
b.x();
}
}