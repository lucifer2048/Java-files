import java.util.*;


public class testJavaCollection {
    public static void main(String[] args) {
        LinkedList<String> a1 = new LinkedList<>();
        a1.add("ravi");
        a1.add("akash");
        a1.add("ajay");
        a1.add("ravi");
        Iterator<String> itr = a1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
