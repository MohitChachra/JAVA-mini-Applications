import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws Exception{
        //File file=new File("C:\\Users\\Mohit Chachra\\Desktop\\abc.txt");
        //File file=new File("C:\\Users\\Mohit Chachra\\Desktop\\final222.pdf");
        //File file=new File("C:\\Users\\Mohit Chachra\\Desktop\\hello.mp3");
        File file=new File("C:\\Users\\Mohit Chachra\\Desktop\\testimonial.png");
        FileInputStream fis=new FileInputStream(file);
        //FileOutputStream fos=new FileOutputStream("C:\\Users\\Mohit Chachra\\Desktop\\bcde.txt");
        //FileOutputStream fos=new FileOutputStream("C:\\Users\\Mohit Chachra\\Desktop\\abc.pdf");
        //FileOutputStream fos=new FileOutputStream("C:\\Users\\Mohit Chachra\\Desktop\\bye.mp3");
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Mohit Chachra\\Desktop\\testimonial.svg");
        int k;
        while((k=fis.read())!=-1){
            fos.write(k);
        }

    }
}
