import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class inputText {
    public static void main(String[] args){

        String osname = System.getProperty("os.name", "").toLowerCase();
        if (osname.startsWith("windows")) {
            String text = "Windows OS";
            try {
                File file = new File("C:/example.txt");
                BufferedWriter output = new BufferedWriter(new FileWriter(file));
                output.write(text);
                output.close();i
		System.out.println("new file: C:/example.txt");
            } catch ( IOException e ) {
                e.printStackTrace();
            }
        } else if (osname.startsWith("linux")) {
            String text = "Linux OS";
            try {
                File file = new File("/root/Desktop/example.txt");
                BufferedWriter output = new BufferedWriter(new FileWriter(file));
                output.write(text);
                output.close();
		System.out.println("new file: /root/Desktop/example.txt");
            } catch ( IOException e ) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Unknown OS.");
        }
    }
}
     
