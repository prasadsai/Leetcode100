import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> list = new ArrayList<>();
        for(int i:nums){
            if(lower<i) list.add(lower+((i-1>lower)?"->"+(i-1):""));
            if(i == upper) return list;
            lower=i+1;
        }
        if(lower<=upper) list.add(lower+((upper!=lower)?"->"+upper:""));
        return list;
    }
}