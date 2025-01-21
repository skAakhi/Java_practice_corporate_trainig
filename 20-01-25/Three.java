interface Car
{

void autoDrive();

void navigate();

void speed();

}




class BMV {

public void safteyMode(){

System.out.println("BMV driving safely");
}
}




class BMW extends BMV implements Car{

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

}

}
