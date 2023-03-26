public class MaximumSumWithKItems {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes+numZeros){
            return Math.min(numOnes,k);
        }else{
            k-=(numOnes+numZeros);
            return numOnes-(k*1);
        }
    }
}