import java.util.HashMap;
import java.util.Map;
public class hashMApEx {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"mango"); 
        map.put(2,"potato");
        map.put(3,"tomato");
        map.put(4,"apple");
        map.put(5,"grapes");
        System.out.println("interating HashMap...");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.put(1,"grapes");
        System.out.println("interating HashMap...");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.replace(3,"kongs");
        System.out.println("iterating hashmap");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.replaceAll((k,v)->"pizza");
        System.out.println("iterating hashmap");
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
