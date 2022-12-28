import java.util.*;

public class MaxLenConcatenatedUniqueString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("un","iq","uec"));
        MaxLenConcatenatedUniqueString maxL = new MaxLenConcatenatedUniqueString();
        System.out.println(maxL.maxLength(list));

    }
    int max = 0;
    public int maxLength(List<String> arr) {
        maxLengthHelper(arr,"",0,arr.size());
        return max;
    }
    public void maxLengthHelper(List<String> list, String s, int p, int len){
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()){
            set.add(c);
        }
        if(set.size()!=s.length()){
            return;
        }
        max=Math.max(max,s.length());
        if(p==len){
            return;
        }
        maxLengthHelper(list,s+list.get(p),p+1,len);
        maxLengthHelper(list,s,p+1,len);
    }
}
