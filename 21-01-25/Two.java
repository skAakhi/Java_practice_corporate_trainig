import java.io.IOException;
import java.util.*;
public class Two {

public static void main(String[] a){

try{
 validateAge(19);
}
catch(IllegalArgumentException e)
{
System.out.println("Exception : "+e.getMessage());
}
}

public static void validateAge(int age)
{
if(age<18)
{
throw new IllegalArgumentException("Age must be above 18");
}
 System.out.println(age);
}
}












class TwoDotOne {

public static void main(String[] a){

try{
 TwoDotOne t = new TwoDotOne();
 t.validateAge(17);
}
catch(IllegalArgumentException e)
{
System.out.println("Exception : "+e.getMessage());
}
}

public void validateAge(int age)
{
if(age<18)
{
throw new IllegalArgumentException("Age must be above 18");
}
 System.out.println(age);
}
}












class TwoDotTwo {

public static void main(String[] a) {

try{
Scanner sc = new Scanner(System.in);
 validateAge(sc.nextInt());
}
catch(IllegalArgumentException e)
{
System.out.println("Exception : "+e.getMessage());
}
}

public static void validateAge(int age)
{
if(age<18)
{
throw new IllegalArgumentException("Age must be above 18");
}
 System.out.println(age);
}
}







class TwoDotThree {

public static void main(String[] a){

try{
Scanner sc = new Scanner(System.in);
 X i = new X();
 i.validateAge(sc.nextInt());
}
catch(IllegalArgumentException e)
{
System.out.println("Exception : "+e.getMessage());
}
}
}


class X{
public static void validateAge(int age)
{
if(age<18)
{
throw new IllegalArgumentException("Age must be above 18");
}
 System.out.println(age);
}
}










class TwoDotFour {

public static void main(String[] args)  {
try{
Scanner sc = new Scanner(System.in);
 Y i = new Y();
 int a=sc.nextInt();
 int b=sc.nextInt();
 i.divide(a,b);
}
catch(ArithmeticException e)
{
System.out.println("Exception : "+e.getMessage());
}
}
}


class Y{
public static void divide(int a,int b)
{

if(b==0)
{
throw new ArithmeticException("Dont divide with zero");
}
 System.out.println(a/b);
}
}





















class TwoDotFive
{
public TwoDotFive() throws Exception
{
System.out.println("Constructor called");
//throw new Exception("Exception in constructor");
}

public void method() throws IOException
{
System.out.println("Method called");
throw new IOException("Exception in method");
}

}

class Main{

public static void main(String[] args)
{
try{

TwoDotFive i = new TwoDotFive();
i.method();
}
catch(IOException e)
{
System.out.println("Hello"+e.getMessage());
}

catch(Exception e)
{
System.out.println("Hai"+e.getMessage());
}

}
}




Respected Sasidhar,

I hope you are doing well. I am writing to formally request leave for January 24, 2025, as I need to attend my brother marriage. This is an important family event, and my presence is essential.


I kindly request your approval for this leave. Thank you for your understanding.








