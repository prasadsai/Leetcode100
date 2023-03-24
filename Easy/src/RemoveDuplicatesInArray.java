public class RemoveDuplicatesInArray {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length){
            if(nums[j]==nums[i]){
                nums[j]=101;
            }else{
                i=j;
            }
            j++;
        }
        i=0;
        j=1;
        while(j<nums.length){
            if(nums[i]==101){
                while(j<nums.length && nums[j]==101){
                    j++;
                }
                if(j>=nums.length) break;
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            i++;j++;
        }
        while(i<nums.length && nums[i]!=101){
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicatesInArray rm = new RemoveDuplicatesInArray();
        System.out.println(rm.removeDuplicates(new int[]{1,1,2,3,4,5}));
    }

}