import java.util.*;
public class Union {
    public static int uni(int[] arr1,int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();
    }
    public static int intersection(int[] arr1,int[] arr2){
        int count=0;
        HashSet<Integer> h1 = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            h1.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            if(h1.contains(arr2[j])){
                count++;
                h1.remove(arr2[j]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1={7,3};
        int[] arr2={6,3,9,2,9,7};
        System.out.println(uni(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
    }
    
}
