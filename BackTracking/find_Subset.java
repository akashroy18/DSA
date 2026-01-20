 public class find_Subset {
    public static void findSub(String str,String ans, int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        findSub(str, ans+str.charAt(i), i+1);
        findSub(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        findSub(str, "", 0);
    }
    
    
}
