import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws Exception {
    FileOutputStream fos=new FileOutputStream("C:\\Users\\Mohit Chachra\\Desktop\\bcd.txt");
    String str="Hello Java";
    for(int k=0;k<=str.length()-1;k++){
        fos.write(str.charAt(k));
    }
    }
}
