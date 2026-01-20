import java.util.*;
public class container_with_most_water {
 /*  public static int getcurrentwater(ArrayList<Integer>ht){
        int maxwater = 0;
        for(int i=0;i<ht.size();i++){
            for(int j=i+1;j<ht.size();j++){
                int height = Math.min(ht.get(i),ht.get(j));
                int width = j - i;
                int current_water = height*width;
                if(current_water>maxwater){
                    maxwater=current_water;
                }
            }
        }
        return maxwater;
    } */ 
   //Above one is brute force approach
   //now with optimised two pointer 
   public static int getcurrentwater(ArrayList<Integer>ht){
    int maxwater = 0;
    int lp = 0;
    int rp = ht.size()-1;
    while (lp<rp) {
        int height = Math.min(ht.get(rp),ht.get(lp));
        int width = rp-lp;
        int current_water = height*width;
        maxwater = Math.max(maxwater, current_water);
        if(ht.get(lp)<ht.get(rp)){
            lp++;
        }
        else{
            rp--;
        }
    }
    return maxwater;
   }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int ans = getcurrentwater(list);
        System.out.println("Maximum water is "+ans);

    }
    
}
