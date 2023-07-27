import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
public class integer {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        

        Integer s = list.get(1);
System.out.println("element is "+s);
Iterator<Integer> itr=list.iterator();
while(itr.hasNext()){
    System.out.println(itr.next());
}
    }
}
