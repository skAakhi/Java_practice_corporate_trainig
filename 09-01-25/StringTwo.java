
import java.util.*;
public class StringTwo{

public static void main(String[] args)
{
String s1="Hello";
String s2="Hello";
String s3=new String("Hello");
String s4="HElLo";

System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s4));
System.out.println(s1.contains("el"));
System.out.println(s1.startsWith("He"));
System.out.println(s1.endsWith("lo"));
System.out.println(s1.substring(0,2).equalsIgnoreCase(s4.substring(0,2)));
}
}


class StringTwoDotOne{

public static void main(String[] args)
{

String s1="  Hello   ";

System.out.println(s1);
System.out.println(s1.length());
System.out.println(s1.trim().length());
System.out.println(s1.length());//--------------->Due to it is immutable


}
}



class StringTwoDotTwo{

public static void main(String[] args)
{
String s1="Hai how are you Aakhib";
String s2="Ha^i h^ow ar^e yo^u Aak^hib";

System.out.println(Arrays.toString(s1.split(" ")));//------>spilt() method will return array of strings(String[])
System.out.println(Arrays.toString(s2.split("\\^")));
System.out.println(Arrays.toString(s1.split("a")));
//System.out.println(java.util.Arrays.toString(s1.split("a")));//---->i[f you havent imported any package(import java.util.*;) then you can directly import in sop()]

String words[] = s1.split(" ");

for(String word:words)
System.out.print(word+" ");



System.out.println();
for(String word:words)
{
char[] a = word.toCharArray();
System.out.print(Arrays.toString(a)+" ");
}




System.out.println();
for(String word:words)
{
char[] a = word.toCharArray();
for(char c : a)
{
System.out.print(c+" ");
}
}

}
}








class StringTwoDotThree{

public static void main(String[] args)
{
String s1="Welcome to infomerica team 123 leaders and 456 managers";


System.out.println(s1);
System.out.println(s1.replace("a","i"));
System.out.println(s1.replaceAll("leaders","Interns"));
System.out.println(s1.replace("managers","Interns"));

System.out.println(s1.replaceAll("\\d","X"));//------------>For digits
System.out.println(s1.replaceAll("\\w","X"));//------------>For words
System.out.println(s1.replaceAll("\\s","X"));//------------>For spaces

}
}







class StringTwoDotFour{

public static void main(String[] args)
{
String s1=" ";
String s2="";
String s3="Hello";

System.out.println(s1.isEmpty());
//System.out.println(s1.isBlank());---------------->java 11
System.out.println(s1.trim().isEmpty());

}
}









class StringTwoDotFive{

public static void main(String[] args)
{

String s1="Ready to strives for money and power with all knowledge";

System.out.println(s1.indexOf("s"));
System.out.println(s1.lastIndexOf("s"));



System.out.println(s1.substring(0,5));


System.out.println(s1.toUpperCase());

System.out.println(s1.toLowerCase());


}
}







class StringTwoDotSix{

public static void main(String[] args)
{

//String to integer

String s1="123";
//int i = Integer.valueOf(s1);
//(or)
Integer i = Integer.valueOf(s1);

System.out.println(s1);
System.out.println(i);

System.out.println(s1.getClass().getName());
System.out.println(i.getClass().getName());

}
}







class StringTwoDotSeven{

public static void main(String[] args)
{

//String to integer

//int i = 12;
Integer i = 12;
String s1=String.valueOf(i);

System.out.println(s1);
System.out.println(i);

System.out.println(s1.getClass().getName());
System.out.println(i.getClass().getName());

}
}



























