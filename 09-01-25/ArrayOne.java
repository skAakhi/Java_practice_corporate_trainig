// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[][] a=new int[2][2];
       
      Random in =new Random();//------------------------->Random is a class used to generate random number
      
      for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = in.nextInt(30); ///------------->size 30 will give default values from 0 to 29
            }
        }
      
      for(int[] i:a)
      {
          for(int arr: i)
          {
              System.out.print(arr+" ");
          }
      }
      
    
    }
}