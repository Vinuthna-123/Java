import java.util.HashSet;
import java.util.Set;
public class Solution5 {
    public boolean hasAllUnique(String s , int k){
        Set<String> seen = new HashSet<>();
        int total = 1<<k;
        for(int i=0;i<s.length()-k;i++){
            String substring = s.substring(i, i+k);
            seen.add(substring);
            if(seen.size() == total){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Solution5 s = new Solution5();
        System.out.println(s.hasAllUnique("1110010", 2));
        System.out.println(s.hasAllUnique("0110", 2));
        System.out.println(s.hasAllUnique("0110", 1));

    }
}
