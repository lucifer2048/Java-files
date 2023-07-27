import java.util.*;
public class Testgenerics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rahul");
        list.add("jai");
        list.add("jai");
        list.add("jai");
        list.add("jai");
        list.add("jai");
        list.add("jai");
        list.add("jai");
        list.add("jai");
        list.add("jai");
        list.add("jai");
        list.add("jai");


        String s = list.get(11);
        String q = list.get(10);
        System.out.println("element is: "+s);
        System.out.println("element is: "+q);
        System.out.println("iterate across the data");
        Iterator<String> itr =list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
