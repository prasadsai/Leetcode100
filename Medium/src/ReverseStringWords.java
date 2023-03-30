public class ReverseStringWords {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s.trim();
        String[] charArrayS = s.split("\\s+");
        for(int i=charArrayS.length-1;i>=0;i--){
            if(charArrayS[i].equals(" ")) continue;
            sb.append(charArrayS[i] + " ");
        }
        return sb.toString().trim();
    }
}
