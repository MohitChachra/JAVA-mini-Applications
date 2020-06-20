import org.apache.commons.io.FileUtils;


import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            String content = FileUtils.readFileToString(new File("Path of your file"), "UTF-8");
            content = content.replaceAll("To replace", "Replace with");
            File tempFile = new File("Path where to save");
            FileUtils.writeStringToFile(tempFile, content, "UTF-8");
        } catch (IOException e) {
            //Simple exception handling, replace with what's necessary for your use case!
            throw new RuntimeException("Generating file failed", e);
        }
    }
}
