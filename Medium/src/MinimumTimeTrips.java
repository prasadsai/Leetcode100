public class MinimumTimeTrips {
    public long minimumTime(int[] time, int totalTrips) {
        long min = time[0];
        for(int m: time){
            min = Math.min(m,min);
        }
        long low =1,high = min*totalTrips;
        while(low<high){
            long mid = low+(high-low)/2;
            if(isPossible(mid, time, totalTrips)){
                high = mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }

    public boolean isPossible(long mid, int[] time,int totalTrips){
        long totalTimeTrips =0l;
        for(int n:time){
            totalTimeTrips+=mid/n;
        }
        if(totalTimeTrips>=totalTrips){
            return true;
        }
        return false;
    }
}
