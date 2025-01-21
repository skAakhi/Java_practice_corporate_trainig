interface I
{
default void y(){
System.out.println("Y code of I");
}

}

interface J
{
default void y(){
System.out.println("Y code of J");
}
}

class A implements I,J
{
public void y()
{
I.super.y();
J.super.y();
System.out.println("Y code of A class");
}

}




class User{

public static void main(String[] args)
{
A i = new A();
i.y();

}

}
//------------------------------------------------------------------------------------------------------------------------












