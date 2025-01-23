class ST extends Thread
{
public void run()
{
try{
Thread t1 = Thread.currentThread();
for (int i = 0; i < 5; i++) {
t1.sleep(1000);
System.out.println(Thread.currentThread().getName() + ": " + i);
 }
}
catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + Thread.currentThread().getName());
            }
}
public static void main(String[] args)
{
ST s = new ST();
ST s1 = new ST();
s.start();
s1.start();

}
}
