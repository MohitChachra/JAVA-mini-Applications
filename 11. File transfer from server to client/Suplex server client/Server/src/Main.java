import java.net.*;
import java.io.*;

public class Main {
        public static void main(String[] args) {
            try {
                ServerSocket ss=new ServerSocket(12321);
                Socket s=ss.accept();
                DataInputStream dis=new DataInputStream(s.getInputStream());
                System.out.println(dis.readUTF());
            } catch (Exception e){

            }

    }
}
