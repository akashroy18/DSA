import java.util.*;
public class basic {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();//that's how we create a list
        //some of operation on list
        list.add(1);
        list.add(62);
        list.add(49);
        list.add(10);
        list.add(612);
        list.add(492);
        System.out.println(list);
        int el = list.get(3);
        System.out.println(el);
        list.remove(3);
        System.out.println(list);
        list.set(2,55 );
        System.out.println(list);
        System.out.println(list.contains(23));
        System.out.println(list.contains(62));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
    
}
