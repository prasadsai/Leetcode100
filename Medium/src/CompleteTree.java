import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class CompleteTree {
    int value = 0;
    int count = 0;
    public boolean isCompleteTree(TreeNode root) {
        checkNodes(root);
        iterateNodes(root);
        return (count==value);
    }

    public void checkNodes(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp.left!=null) queue.offer(temp.left);
            if(temp.right!=null) queue.offer(temp.right);
            count++;
        }
        // count++;
        // checkNodes(root.left);
        // checkNodes(root.right);
    }

    public void iterateNodes(TreeNode root){
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            value++;
            if(temp.left==null){
                return;
            }
            if(temp.right==null){
                value++;
                return;
            }
            if(temp.left!=null && temp.right!=null){
                queue.add(temp.left);
                queue.add(temp.right);
                value+=1;
            }
        }
    }
}