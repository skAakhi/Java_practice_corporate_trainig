public class One {

public static void main(String[] a) {

try{

int i=Integer.parseInt(a[0]);
int j=Integer.parseInt(a[1]);
System.out.println(i+j);// i/j
}
catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Please pass more than one value ");
 } 
catch (NumberFormatException e) {
 System.out.println("Please enter valid integers");
 } 
catch (IllegalArgumentException e) {
System.out.println(e.getMessage());
} 
catch (ArithmeticException e) {
System.out.println("Please recheck your calculation eighther value/0 ");
System.out.println(e.getMessage());
} 
catch (Exception e) {
System.out.println("An unexpected error occurred");
}

}
}

