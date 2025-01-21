interface Car
{
void autoDrive();
void navigate();
void speed();
}




interface Bike
{
void  voiceStart();
void  engineCool();
void  safteyBag();
}





abstract class BMV {

public void safteyMode(){

System.out.println("BMV driving safely");
}

public abstract void horn();

}




class BMW extends BMV implements Car,Bike{

public void autoDrive()
{
System.out.println("BMW autoDrive code");
}

public void navigate()
{
System.out.println("BMW navigate code");
}

public void speed()
{
System.out.println("BMW speed for 450km/hr code");
}

public void voiceStart()
{
System.out.println("BMW Bike voiceStart code");
}

public void engineCool()
{
System.out.println("BMW Bike engineCool code");
}

public void safteyBag()
{
System.out.println("BMW Bike safteyBag code");
}



public void horn()
{
System.out.println("BMW horn");
}

}





class User{

public static void main(String[] args)
{
BMW u1 = new BMW();
//(or)
//Car u1 = new BMW();---------------------->To implement only methods of Car interface,if you include this line safteyMode() cannot be in accessible
u1.autoDrive();
u1.navigate();
u1.speed();
u1.safteyMode();
u1.voiceStart();
u1.engineCool();
u1.safteyBag();
u1.horn();

}

}
