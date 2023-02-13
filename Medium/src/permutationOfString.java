import java.util.HashMap;

public class permutationOfString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        HashMap<Character,Integer> mapH1 = new HashMap<>(), mapH2 = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            mapH1.put(s1.charAt(i),mapH1.getOrDefault(s1.charAt(i),0)+1);
            mapH2.put(s2.charAt(i),mapH2.getOrDefault(s2.charAt(i),0)+1);
        }
        int j=s1.length()-1,i=0;
        while(j<s2.length()){
            j++;
            if(mapH1.equals(mapH2)) return true;
            if(j==s2.length()) return false;
            mapH2.put(s2.charAt(j),mapH2.getOrDefault(s2.charAt(j),0)+1);
            mapH2.put(s2.charAt(i),mapH2.get(s2.charAt(i))-1);
            if(mapH2.get(s2.charAt(i))==0) mapH2.remove(s2.charAt(i));
            i++;
        }
        return false;
    }
}