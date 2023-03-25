import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {
    int sum =0;
    public int sumOfUnique(int[] nums) {
        int[] arr = new int[101];
        for(int n: nums){
            arr[n]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1) sum+=i;
        }
        return sum;
    }
    public void ActualSolution(int[] nums){
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int n:nums){
             map.put(n,map.getOrDefault(n,0)+1);
         }
         for(Map.Entry<Integer,Integer> entry: map.entrySet()){
             if(entry.getValue()==1){
                 sum+=entry.getKey();
             }
         }
    }
}
