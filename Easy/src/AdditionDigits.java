public class AdditionDigits {
    public int addDigits(int num) {
        int sum =num;
        while(sum>=10){
            sum = sumDigits(sum);
        }
        return sum;
    }
    public int sumDigits(int num){
        int sum =0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}