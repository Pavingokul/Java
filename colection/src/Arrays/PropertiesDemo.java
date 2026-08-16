package Arrays;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String args[]) throws IOException {
        Properties p=new Properties();
        FileInputStream f=new FileInputStream("C:\\Users\\Pavingokul\\IdeaProjects\\Collection\\src\\Arrays\\text.properties");
        p.load(f);
        System.out.println(p);
        System.out.println(p.getProperty("dosa"));
        FileOutputStream f1=new FileOutputStream("C:\\Users\\Pavingokul\\IdeaProjects\\Collection\\src\\Arrays\\text.properties");
        p.store(f1,"upated file");
    }
}
