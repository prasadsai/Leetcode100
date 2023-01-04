import java.util.*;

public class CourseSchedule {
    HashMap<Integer, List<Integer>> map = new HashMap<>();
    HashSet<Integer> set = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<prerequisites.length;i++){
            if(map.containsKey(prerequisites[i][0])){
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }else{
                map.put(prerequisites[i][0],new ArrayList<>(Arrays.asList(prerequisites[i][1])));
            }
        }
        for(int i=0;i<numCourses;i++){
            boolean flag = canFinishHelper(i);
            if(!flag) return false;
        }
        return true;
    }
    public boolean canFinishHelper(int node){
        List<Integer> list = map.get(node);
        if(list==null) return true;
        set.add(node);
        for(int i=0;i<list.size();i++){
            if(set.contains(list.get(i))) return false;
            boolean flag = canFinishHelper(list.get(i));
            if(!flag) return false;
            map.get(node).remove(0);
        }
        set.remove(node);
        return true;
    }
}
