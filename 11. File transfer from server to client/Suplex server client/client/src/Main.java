import java.net.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            Socket s=new Socket(/*"192.168.43.79"*/ "local host",12321);
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("hello");
            dos.close();
        } catch (Exception e){

        }

}
}
