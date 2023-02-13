public class GCD_of_String{
    public String gcdOfStrings(String str1, String str2) {
        String bigger = str1.length()>str2.length() ? str1:str2;
        String smaller = str1.length()>str2.length() ? str2:str1;

        if(bigger.equals(smaller)) return bigger;
        if(!bigger.startsWith(smaller)) return "";

        return gcdOfStrings(bigger.substring(smaller.length()), smaller);

    }

    public static void main(String[] args) {

        String str1 ="ABABABABAB";
        String str2 ="ABAB";
        GCD_of_String gcdStr = new GCD_of_String();
        System.out.println(gcdStr.gcdOfStrings(str1,str2));

    }

}
