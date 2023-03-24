import java.util.ArrayList;
import java.util.List;

public class ArrayFormOfInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        boolean carry = false;
        int i = num.length-1;
        while((k>0 || carry) && i>=0){
            if(carry){
                num[i]+=k%10+1;
                carry = false;
            }else{
                num[i]+=k%10;
            }
            if(num[i]>9){
                num[i]%=10;
                carry = true;
            }
            k/=10;
            i--;
        }

        List<Integer> li = new ArrayList<>();
        for(i=0;i<num.length;i++){
            li.add(num[i]);
        }
        while(k>0){
            if(carry){
                k+=1;
                carry = false;
            }
            li.add(0,k%10);
            k/=10;
        }
        if(carry){
            li.add(0,1);
        }
        return li;
    }
}