class X {
    public static void main(String[] a) {
        // Ensure the array has enough elements to access index 2
        if (a.length > 2) {
            System.out.println(a[2]);
        } else {
            System.out.println("Index 2 is out of bounds. Please provide at least 3 arguments.");
        }
    }
}



class X1{
   public static void main(String[] a){//---->a=10,20,30......
    System.out.println(a[0]+a[1]);//--->"1020" as output mean treating as a string

    //int i =Integer.parseInt(a[0]);-------->Ex:"10"--->10[Converted string to integer] 
    //int j =Integer.parseInt(a[1]);
    
    //System.out.println(i+j);//->30
 }
}