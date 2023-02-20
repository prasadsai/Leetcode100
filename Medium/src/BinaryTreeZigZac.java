import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeZigZac {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        zigzagLevelOrderHelper(root, 0);
        for(int i=0;i<list.size();i++){
            if(i%2!=0){
                Collections.reverse(list.get(i));
            }
        }
        return list;
    }

    public void zigzagLevelOrderHelper(TreeNode root, int d){
        if(root==null){
            return;
        }
        if(list.size()<=d){
            list.add(new ArrayList<>());
        }
        list.get(d).add(root.val);
        zigzagLevelOrderHelper(root.left,d+1);
        zigzagLevelOrderHelper(root.right,d+1);
    }
}
