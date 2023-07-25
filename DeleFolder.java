import java.io.File;
import java.util.Scanner;
import java.lang.Exception;

class DeleFolder {
    public static void main(String[] args) {
        String filePath;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the directory path for deleting a directory");
        filePath = sc.nextLine();
        sc.close();
        File file = new File(filePath);
        try{
            deleteDirectory(file);
            file.delete();
            System.out.println("your directory is deleted successfully");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void deleteDirectory(File file) {
        for(File subfile : file.listFiles()){
            if(subfile.isDirectory()){
                deleteDirectory(subfile);
            }
            subfile.delete();
        }
        
    }
}
