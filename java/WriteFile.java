import java.io.FileWriter;  
import java.io.IOException;
public class WriteFile {
  public static void main(String[] args) {
    try {
      FileWriter w = new FileWriter("file1.txt");
      w.write("hello everyone!!!!!!!!!!!");
      w.close();
      System.out.println("Successfully wrote to the file.");
    }
     catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}