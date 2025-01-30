import java.net.*;

class A {
    public static void main(String[] args) {
        try {
            URL obj = new URL("https://www.youtube.com/watch?v=EH8IIeWEujI");

            System.out.println("Protocol: " + obj.getProtocol());
            System.out.println("Host: " + obj.getHost());
            System.out.println("Port: " + obj.getPort());
            System.out.println("FileName: " + obj.getFile());

        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        }
    }
}
