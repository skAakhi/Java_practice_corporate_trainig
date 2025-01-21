interface I
{
void x();

default void y()
{
System.out.println("I of Y code");
}
}



interface J
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
A i = new A();

i.x();
i.y();
i.z();

I i1 = new A();
i1.x();
i1.y();

J i2 = new A();
i2.z();


}

}