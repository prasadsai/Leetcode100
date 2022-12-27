public class SortedToBalancedTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return ConstructBSTree(nums,0,nums.length-1);
    }
    public TreeNode ConstructBSTree(int[] nums,int left, int right){
        if(left>right) return null;
        int mid = left+(right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = ConstructBSTree(nums,left,mid-1);
        root.right = ConstructBSTree(nums,mid+1,right);
        return root;
    }

    public static void main(String[] args) {
        SortedToBalancedTree st = new SortedToBalancedTree();
        int[] arr = {-10,-3,1,5,9};
        System.out.println(st.sortedArrayToBST(arr).val);
    }
}
