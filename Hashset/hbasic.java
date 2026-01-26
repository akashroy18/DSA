import java.util.HashSet;
import java.util.Iterator;
public class hbasic {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(1);//onsert o(1)
        //search
        if(h.contains(1)){
            System.out.println("found");
        }
        if(!h.contains(5)){
            System.out.println("not found");
        }
        //delete
        h.remove(1);
        if(!h.contains(1)){
            System.out.println("not found");
        }
        //size
        System.out.println(h.size());
        h.add(1);
        Iterator it = h.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
