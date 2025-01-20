
public class ConstructorOne {
    int a;
    int b;
    ConstructorOne(int a,int b)
    {  
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }
    
    public void print()
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
      ConstructorOne e = new ConstructorOne(10,20);
        e.print();
    }
}


//Default constructor

class ConstructorOneDotOne {
    int a;
    int b;
    ConstructorOneDotOne()
    {  
        this.a=10;
        this.b=20;
        System.out.println(a+b);
    }
    
    public void print()
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
      ConstructorOneDotOne e = new ConstructorOneDotOne();
        e.print();
    }
}












//Constructor chaining

//Note: circular constructor will not be possible


class ConstructorTwo {
    int a;
    int b;
    ConstructorTwo(int a,int b)
    {  
        this(10,20,30);
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }
    
    ConstructorTwo(int a,int b,int c)
    {  
        this.print(); 
        this.printOne(40,40);
        System.out.println(a+b+c);
    }

    
    
    public void print()
    {   
        System.out.println(a+b);
    }
    
     public void printOne(int a,int b)
     {
        System.out.println(a+b);
     }
    
    public static void main(String[] args) {
      ConstructorTwo e= new ConstructorTwo(10,20);
        e.print();
    }
}









class ConstructorThree {
    int a;
    int b;
    ConstructorThree(int a,int b)
    {  
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }
    
    ConstructorThree(int a,int b,int c)
    {  
      
        System.out.println(a+b+c);
    }

    
    
    public void print()
    {   
        //this(40,10,40);//------------------------------------------------>Cannot call constructor with this keyword
      // ConstructorThree obj= new ConstructorThree(40,10,40);//(or)
        new ConstructorThree(40,10,40);
        System.out.println(a+b);//(or)  sop(this.a+this.b);
    }
    
     public void printOne(int a,int b)
     {
        System.out.println(a+b);
     }
    
    public static void main(String[] args) {
      ConstructorThree e= new ConstructorThree(10,20);
        e.print();
    }
}













