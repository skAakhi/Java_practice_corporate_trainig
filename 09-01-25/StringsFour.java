
//7.
import java.util.*;
public class StringsFour{

public static void main(String[] args)
{

String s1="This is a test string!!";

StringBuilder result=new StringBuilder();

String[] words=s1.split(" ");


for(int i=0;i<words.length;i++)
{
if(i%2==0)
{
result.append(words[i].toUpperCase()).append(" ");

}
else{
StringBuilder rev = new StringBuilder(words[i]);
result.append(rev.reverse()).append(" ");
}
}
System.out.println(result);
}

}











//8.

class StringsFourDotOne{

public static void main(String[] args)
{
String s1="skAakhib29@gmail.com";


char[] ch=s1.toCharArray();

int i=0,upper=0,lower=0,special=0,digits=0;
while(i<ch.length)
{
if(ch[i]>=65 && ch[i]<=90)
{
upper++;
}
else if(ch[i]>=97 && ch[i]<=122)
{
lower++;
}
else if(ch[i]>=48 && ch[i]<=57)
{
digits++;
}
else{
special++;
}
i++;
}
System.out.println(upper +" "+ lower+" "+digits+" "+special);


}
}













//8.1

class StringsFourDotTwo {

    public static void main(String[] args) {
        String s1 = "skAakhib29@gmail.com";

        int upper = 0, lower = 0, special = 0, digits = 0;

        // Iterate through each character of the string
        for (char ch : s1.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper++; // Check if uppercase
            } else if (Character.isLowerCase(ch)) {
                lower++; // Check if lowercase
            } else if (Character.isDigit(ch)) {
                digits++; // Check if digit
            } else {
                special++; // All other characters
            }
        }

        // Print the results
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);
    }
}


//Note:
//Yes, Character is a class in Java, specifically a wrapper class in the java.lang package. 
//It is used to work with characters (primitive char) as objects.


//Commonly Used Methods:

//Character.isUpperCase(char c): Checks if a character is uppercase.
//Character.isLowerCase(char c): Checks if a character is lowercase.
//Character.isDigit(char c): Checks if a character is a digit.
//Character.isLetter(char c): Checks if a character is a letter (uppercase or lowercase).
//Character.toUpperCase(char c): Converts a character to uppercase.
//Character.toLowerCase(char c): Converts a character to lowercase.
//Character.isWhitespace(char c): Checks if a character is a whitespace character.









//9.

class StringsFourDotThree{

public static void main(String[] args)
{

String str="java is easy";
char s1,s2;

s1=FindFirstRepeated(str);
s2=FindFirstNonRepeated(str);

System.out.println("FirstRepeated : "+s1+" FirstNonRepeated : "+s2);
}

private static char FindFirstRepeated(String str)
{
 
 for(int i=0;i<str.length();i++)
 {
  char ch=str.charAt(i);

  if(ch!=' ' && str.indexOf(ch) != str.lastIndexOf(ch))
  {
   return ch;
  }
  
 }
  return '\0';
}

private static char FindFirstNonRepeated(String str)
{

  for(int i=0;i<str.length();i++)
  {
  char ch=str.charAt(i);

  if(ch!=' ' && str.indexOf(ch) == str.lastIndexOf(ch))
  {
   return ch;
  }
  
 }
  return '\0';
}

}









//9.1[Using data structures concepts]

// //import java.util.LinkedHashMap;
// //import java.util.Map;

// public class FirstRepeatedNonRepeated {
//     public static void main(String[] args) {
//         String input = "java is easy";
//         System.out.println("Input: " + input);
        
//         char firstRepeated = findFirstRepeatedCharacter(input);
//         char firstNonRepeated = findFirstNonRepeatedCharacter(input);
        
//         System.out.println("First Repeated Character: " + firstRepeated);
//         System.out.println("First Non-Repeated Character: " + firstNonRepeated);
//     }
    
//     // Method to find the first repeated character
//     private static char findFirstRepeatedCharacter(String str) {
//         Map<Character, Integer> charCount = new LinkedHashMap<>();
        
//         for (char c : str.toCharArray()) {
//             if (c != ' ') {
//                 charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//                 if (charCount.get(c) == 2) {
//                     return c;
//                 }
//             }
//         }
//         return '\0'; // Return null character if no repeated character is found
//     }
    
//     // Method to find the first non-repeated character
//     private static char findFirstNonRepeatedCharacter(String str) {
//         Map<Character, Integer> charCount = new LinkedHashMap<>();
        
//         for (char c : str.toCharArray()) {
//             if (c != ' ') {
//                 charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//             }
//         }
        
//         for (char c : str.toCharArray()) {
//             if (c != ' ' && charCount.get(c) == 1) {
//                 return c;
//             }
//         }
//         return '\0'; // Return null character if no non-repeated character is found
//     }
// }











// //10.
// //import java.util.ArrayList;

// public class EvenPositionWords {
//     public static void main(String[] args) {
//         String input = "java is keka easy and awesome";
//         System.out.println("Input: " + input);
        
//         String[] evenWordsArray = getEvenPositionWords(input);
        
//         System.out.print("Output: {");
//         for (int i = 0; i < evenWordsArray.length; i++) {
//             System.out.print("\"" + evenWordsArray[i] + "\"");
//             if (i < evenWordsArray.length - 1) {
//                 System.out.print(", ");
//             }
//         }
//         System.out.println("}");
//     }

//     // Method to extract words at even positions
//     private static String[] getEvenPositionWords(String str) {
//         String[] words = str.split("\\s+"); // Split the string into words
//         ArrayList<String> evenWords = new ArrayList<>();
        
//         for (int i = 1; i < words.length; i += 2) { // Start from index 1 (even position in 1-based index)
//             evenWords.add(words[i]);
//         }
        
//         // Convert ArrayList to an array
//         return evenWords.toArray(new String[0]);
//     }
// }











//11.
class StringsFourDotFour{

public static void main(String[] args)
{
String s1="Hello how are you moooooon";

String s2="hello how are you reddy";

System.out.println(FindMaxWord(s1));
System.out.println(FindMaxWord(s2));
}

private static String FindMaxWord(String str)
{
String[] words=str.split(" ");
String MaxWord="";
int MaxLen=0;

for(String word:words)
{
if(word.length()>MaxLen)
{
MaxLen=word.length();
MaxWord=word;
}
}
return MaxWord;
}
}










//12.

class StringsFourDotFive{

public static void main(String[] args)
{
String s1="New York";

String s2="nwyr";

String output=CompareTwoStrings(s1,s2);
System.out.println(output);

}

private static String CompareTwoStrings(String str1,String str2)
{
StringBuilder res=new StringBuilder();
str2=str2.toUpperCase();

for(char ch : str1.toCharArray())
{
if(ch!=' ' && str2.indexOf(Character.toUpperCase(ch))!=-1)
{
res.append(ch);//-->Character.toLowerCase(ch)
}
else{
res.append('+');
}
}
return res.toString();
}
}











//13.
 class NameFormatter {
    public static void main(String[] args) {
        // Inputs
        String firstName = "Steve";
        String lastName = "jobs";
        
        // Get the first character of the first name
        char firstInitial = firstName.charAt(0);
        
        // Format the output as "LastName,FirstInitial"
        String result = lastName + "," + firstInitial;
        
        // Print the output
        System.out.println(result);
    }
}







//14.


class StringsFourDotSix{

public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);

String fileName=sc.nextLine();
String extention="";
int i=fileName.lastIndexOf('.');

if(i>0 && i<fileName.length()-1)
{
extention=fileName.substring(i+1);
}
else
{
System.out.println("There is no file extension");
}
System.out.println(extention);
}

}






class StringsFourDotSeven{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

String str=sc.nextLine();
int len=str.length();
char[] ch=str.toCharArray();
boolean flag=false;
for(int i=0;i<len/2;i++)
{
if(ch[i]!=ch[len-i-1]){
System.out.println("Not a palindrome");
flag=true;
}
}
if(!flag)
System.out.println("It is a palindrome");
}
}








