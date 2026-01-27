import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        //insert
        map.put("India",150 );
        map.put("China",120);
        map.put("USA",20);
        System.out.println(map);
        map.put("China",135 ); //here put will update if he found the same key already exsist
        System.out.println(map);
        //search
        if(map.containsKey("China")){ //it return true or false
            System.out.println("China found");
        }
        else{
            System.out.println("china not found");
        }
        //one more way
        System.out.println(map.get("China")); //it will return value of the key if found other wise null
        System.out.println(map.get("pakistan"));
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        map.remove("China");
        System.out.println(map);

    }
    
}
