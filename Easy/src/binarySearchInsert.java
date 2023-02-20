public class binarySearchInsert {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

        //-----alternative approach
        // public int binarySearchInsert(int[] nums, int target, int start, int end){
        //     if(start==end){
        //         if(nums[start]<target){
        //             return start+1;
        //         }else{
        //             return start;
        //         }
        //     }
        //     if(start>end) return start;
        //     int mid = start+(end-start)/2;
        //     if(nums[mid]==target) return mid;

        //     if(nums[mid]>target){
        //         return binarySearchInsert(nums,target,start,mid-1);
        //     }else{
        //         return binarySearchInsert(nums,target,mid+1,end);
        //     }
        // }
}
