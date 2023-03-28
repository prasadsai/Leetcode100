public class DiStringMatch {
    public int[] diStringMatch(String s) {
        int low =0,high=s.length();
        int[] arr=new int[s.length()+1];
        int x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[x++]=low++;
            }
            if(s.charAt(i)=='D'){
                arr[x++]=high--;
            }
        }
        arr[x]=high;
        return arr;
    }
}