
import java.io.FileWriter;
import java.io.IOException;

public class Writefile {

    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("C:\\New folder\\something.txt");
            myWriter.write("Files in java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("SUCCESSFULLY WROTE THIS FILE!");
        }catch( IOException e){
            System.out.println("an error occured.");
            e.printStackTrace();

        }
    }
}


    

