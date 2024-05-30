import java.io.File;  
import java.io.IOException;  
class CreateFile{
    public static void main(String args[])
    {
      try {
        File obj = new File("file1.txt");
        if (obj.createNewFile()) {
          System.out.println("File created: " + obj.getName());
        } else {
          System.out.println("File already exists.");
        }
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
}
