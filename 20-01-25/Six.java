interface I
{
void x();

default void y()
{
System.out.println("I of Y code");
}
}



interface J extends I
{
default void z()
{
System.out.println("J of z code");
}
}




class A implements I,J{

public void x(){

System.out.println("A of x code");
}
}


class User{

public static void main(String[] args)
{
J i = new A();

i.x();
i.y();
i.z();

}

}