public abstract class One
{
abstract void copy();
abstract void paste();
abstract void capture();
abstract void autoWrite();
}

abstract class OneDotOne extends One
{
public void copy()
{
System.out.println("Copy code");
}
}


abstract class OneDotTwo extends OneDotOne{
public void paste()
{
System.out.println("Paste code");
}
}


abstract class OneDotThree extends OneDotTwo{

public void capture()
{
System.out.println("Copy code");
}

}




class OneDotFour extends OneDotThree{

public void autoWrite()
{
System.out.println("Copy code");
}
}



class Main{
public static void main(String[] args)
{

One u1=new OneDotFour();
u1.copy();
u1.paste();
u1.capture();
u1.autoWrite();

}
}


