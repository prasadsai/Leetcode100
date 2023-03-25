public class KokoEatingBananas {
    int result = 1;
    public int minEatingSpeed(int[] piles, int h) {
        minEatingSpeedHelper(piles, h, 1, 1000000000);
        return result;
    }

    public void minEatingSpeedHelper(int[] piles, int h, int low, int high){
        result = low;
        if(low>=high) return;
        int k=low+(high-low)/2;
        int time =0;
        for(int p: piles){
            time+=(p-1)/k + 1;
            if(time>h) break;
        }
        if(time<=h){
            high = k;
        }else{
            low = k+1;
        }
        minEatingSpeedHelper(piles,h,low,high);
    }
}
