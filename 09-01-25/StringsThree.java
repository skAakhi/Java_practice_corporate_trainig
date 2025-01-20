//Tasks:

//1.

import java.util.*;
public class StringsThree{

public static void main(String[] args)
{
String s1="java is super";

System.out.println(s1.length());


//Without using function


char[] ch=s1.toCharArray();
int i=0;
while(i<ch.length)
{
i++;
}
System.out.println(i);

}
}




//2.
class StringsThreeDotOne{

public static void main(String[] args)
{
String s1="java is super and keka";

char[] ch=s1.toCharArray();
int i=0,count=1;

while(i<ch.length)
{
if(ch[i]==' ')
{
count++;
}
i++;
}
System.out.println(count);

}
}







//2.1

class StringsThreeDotTwo {

    public static void main(String[] args) {
        String s1 = "java is super";

        int count = 0;

        for (int i = 0; i < s1.length(); i++) { // Iterate through the string using its index
            if (s1.charAt(i) == ' ') {         // Check if the character is a space
                count++;
            }
        }

        System.out.println("Number of spaces: " + count);
    }
}





//2.2

class StringsThreeDotThree {

    public static void main(String[] args) {
        String s1 = "java is super";

        int count = 0;
        int i = 0;

        try {
            while (true) { // Infinite loop, break when accessing out of bounds
                if (s1.charAt(i) == ' ') { // Check if character is a space
                    count++;
                }
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exit loop when the exception is thrown
        }

        System.out.println("Number of spaces: " + count);
    }
}





//2.3 Only using with methods

class StringsThreeDotFour {

    public static void main(String[] args) {
        String s1 = "java is super keka mawa";

        // Replace all spaces with an empty string and calculate the difference in lengths
        int spaceCount = s1.length() - s1.replace(" ", "").length();

        System.out.printf("Number of spaces: %d%n", spaceCount+1);
    }
}








//2.4

class StringsThreeDotFive {

    public static void main(String[] args) {
        String s1 = "java is super";

        // Split the string by spaces
        String[] parts = s1.split(" ");

        // The number of spaces is the number of parts - 1
        int spaceCount = parts.length;
        
        System.out.println(Arrays.toString(parts));
        System.out.println("Number of spaces: " + spaceCount);
    }
}










//3.

class StringsThreeDotSix{

public static void main(String[] args)
{
String s1="Hello world";
char target='o';

int totalOccurance=s1.length()-s1.replace(String.valueOf(target),"").length();

System.out.println(totalOccurance);
}
}







//3.1

class StringsThreeDotSeven{

public static void main(String[] args)
{
String s1="Hello world";
char target='l';
int i=0,count=0;
char[] word=s1.toCharArray();

while(i<word.length)
{
if(word[i]==target)
{
count++;
}
i++;
}

System.out.println(count);
}
}













//4.
class StringsThreeDotEight{

public static void main(String[] args)
{

String s1="java is super";
System.out.println(s1);
System.out.println(s1.substring(1)+s1.charAt(0));
int i=s1.length()-1;
char word[]=s1.toCharArray();

while(i>=0)
{
System.out.print(word[i]);
i--;
}
}
}





//4.1

class StringsThreeDotNine{

public static void main(String[] args)
{
String s1="Aakhib hello";

String s2=reverse(s1);

System.out.print(s2);
}


public static String reverse(String s)
{
if(s.isEmpty())
{
return s;
}

return reverse(s.substring(1))+s.charAt(0);

}
}









//5
//Refer from previous files







//6.
class StringsThreeDotTen{

public static void main(String[] args)
{
String s1="java is easy";
StringBuilder result=new StringBuilder();

String words[]=s1.split(" ");

for(String word:words)
{
StringBuilder rev=new StringBuilder(word);
result.append(rev.reverse()).append(" ");
}
System.out.print(result);

}
}





//6.1
class ReverseEachWord {

    public static void main(String[] args) {
        String input = "java is easy";
        
        // Split the input string by spaces into words
        String[] words = input.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        // Reverse each word and append to the result
        for (String word : words) {
            result.append(reverseWord(word)).append(" ");
        }
        
        // Remove the last extra space
        System.out.println("Reversed string: " + result.toString().trim());
    }

    // Helper method to reverse a single word
    public static String reverseWord(String word) {
        StringBuilder reversedWord = new StringBuilder(word);
        return reversedWord.reverse().toString();
    }
}




















