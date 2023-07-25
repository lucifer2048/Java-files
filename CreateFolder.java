import java.io.File;
import java.util.Scanner;
public class CreateFolder {
    public static void main(String[] args) {
        System.out.println("enter the path where you want to create a folder: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        System.out.println("enter the name of the desired a directory ");
        path = path+sc.next();
        File f1 = new File(path);
        boolean bool = f1.mkdir();
        if(bool){
            System.out.println("folder is created successfully");
        }
        else{
            System.out.println("error found!");
        }
    }
}
