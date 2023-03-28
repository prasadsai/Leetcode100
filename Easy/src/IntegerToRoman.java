public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        int i = 0;
        while(i<values.length){
            if(values[i]<=num){
                int times = num/values[i];
                num-=(values[i] * times);
                for(int x=0;x<times;x++){
                    sb.append(symbols[i]);
                }
            }
            i++;
        }
        return sb.toString();
    }
}
