import java.util.Arrays;

public class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] nums = Arrays.copyOfRange(nums1, 0, m); //returns the sub-array
        while(i<m && j<n){
            if(nums[i]<=nums2[j]){
                nums1[k]=nums[i];
                i++;
            }else{
                nums1[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            nums1[k]=nums[i];
            i++;k++;
        }
        while(j<n){
            nums1[k]=nums2[j];
            j++;k++;
        }
    }

    public static void main(String[] args) {
        int[] nums1 ={1,2,3,0,0,0};
        int[] nums2 ={2,5,6};
        MergeSortArray mr = new MergeSortArray();
        mr.merge(nums1,3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }
}
