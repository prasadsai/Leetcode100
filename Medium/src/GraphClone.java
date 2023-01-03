import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

class GraphClone {
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        HashMap<Node,Node> map= new HashMap<>();
        LinkedList<Node> queue = new LinkedList<>();
        Deque<Node> stack = new LinkedList<>();
        stack.push(node);
        map.put(node, new Node(node.val, new ArrayList<>()));
        while(!stack.isEmpty()){
            Node current = stack.pop();
            for(int i=0;i<current.neighbors.size();i++){
                if(!map.containsKey(current.neighbors.get(i))){
                    map.put(current.neighbors.get(i), new Node(current.neighbors.get(i).val,new ArrayList<>()));
                    stack.push(current.neighbors.get(i));
                }
                map.get(current).neighbors.add(map.get(current.neighbors.get(i)));
            }
        }
        return map.get(node);
    }
}