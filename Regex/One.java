import java.util.regex.*;
public class One
{
public static void main(String[] args)
{
Pattern p = Pattern.compile("..m");
Matcher m = p.matcher("aim");
boolean b1 = m.matches();

System.out.println(b1);


boolean b2 = Pattern.compile("..m").matcher("aim").matches();
System.out.println(b2);

boolean b3 = Pattern.matches("..m","aim");
System.out.println(b3);

System.out.println();


System.out.println(Pattern.matches("[abcd]","axyz"));
System.out.println(Pattern.matches("[abcd]","a"));


System.out.println();
System.out.println(Pattern.matches("[^abcd]","a"));
System.out.println(Pattern.matches("[^abcd]","x"));

System.out.println();
System.out.println(Pattern.matches("^[abcd]","a"));
System.out.println(Pattern.matches("^[abcd]","d"));
System.out.println(Pattern.matches("^[abcd]","x"));

System.out.println();
System.out.println(Pattern.matches("[A-Za-z]","A"));
System.out.println(Pattern.matches("[A-Za-z]","a"));

System.out.println();
System.out.println(Pattern.matches("[A-Za-z]{6}","Aakhib"));
System.out.println(Pattern.matches("[SA][a-z]{5}","Aakhib"));//{5} reason to 'A' character wont take into account for count
System.out.println(Pattern.matches("[SA][A-Z a-z]{8}","Sk Aakhib"));


System.out.println();
//Quantifiers ? + *
//? Occurs once and not at all
System.out.println(Pattern.matches("[abcd]?","a"));
System.out.println(Pattern.matches("[abcd]?","aabbacd"));
System.out.println(Pattern.matches("[abcd]?","abcds"));


System.out.println();
//+  occurs once or more times
System.out.println(Pattern.matches("[abcd]+","a"));
System.out.println(Pattern.matches("[abcd]+","aabacd"));
System.out.println(Pattern.matches("[abcd]+","bbcbd"));
System.out.println(Pattern.matches("[abcd]+","xyz"));



System.out.println();
//*  occurs zero or more times
System.out.println(Pattern.matches("[abcd]*","a"));
System.out.println(Pattern.matches("[abcd]*","aabacd"));
System.out.println(Pattern.matches("[abcd]*","bbcbd"));
System.out.println(Pattern.matches("[abcd]*",""));


System.out.println();
//---->\\d is to check digit
System.out.println(Pattern.matches("\\d","1"));
System.out.println(Pattern.matches("\\d*","1234"));
System.out.println(Pattern.matches("\\d","1c"));


System.out.println();
//---->\\D is to check character 
System.out.println(Pattern.matches("\\D","c"));
System.out.println(Pattern.matches("\\D","1d"));
System.out.println(Pattern.matches("\\D*","abc"));




}
}

 
