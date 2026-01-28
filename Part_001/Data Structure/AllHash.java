import java.util.HashMap;
import java.util.HashSet;

public class AllHash{
    public static void hashMap(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 5);
        map.put("Orange", 8);
        System.out.println(map.get("Apple"));
        System.out.println(map.containsKey("Banana"));
        map.remove("Orange");
        for(String key : map.keySet()){
            System.out.println(key + " = " + map.get(key));
        }
    }

    public static void hashSet(){
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        System.out.println(set.contains("Banana"));
        System.out.println(set.size());
        for(String item : set){
            System.out.println(item);
        }
    }

    public static void main(String[] args){
        hashMap();
        hashSet();
    }
}
