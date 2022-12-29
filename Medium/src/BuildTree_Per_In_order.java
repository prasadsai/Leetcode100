import java.util.*;
public class BuildTree_Per_In_order {
    HashMap<Integer,Integer> map = new HashMap<>();
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return buildTreeHelper(preorder,inorder,0,inorder.length-1);
    }
    public TreeNode buildTreeHelper(int[] preorder, int[] inorder,int start,int end){
        if(start>end) return null;
        TreeNode root = new TreeNode(preorder[preIndex]);
        preIndex++;
        int index = map.get(root.val);
        root.left=buildTreeHelper(preorder,inorder,start,index-1);
        root.right=buildTreeHelper(preorder,inorder,index+1,end);
        return root;
    }

    public static void main(String[] args) {
        BuildTree_Per_In_order st = new BuildTree_Per_In_order();
        int[] preOrder = {3,9,20,15,7};
        int[] inOrder = {9,3,15,20,7};
        st.buildTree(preOrder,inOrder);
    }
}
