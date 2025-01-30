
import java.io.*;
import java.net.*;

public class MyClient {

public static void main(String[] args) {

try{

Socket soc = new Socket("localhost",1234);


ObjectOutputStream os = new ObjectOutputStream(soc.getOutputStream());

os.writeUTF("Hello Aakhib im from client side");

os.flush();
soc.close();
os.close();
}
catch(Exception e )
{

System.out.println(e);
}
}
}



 