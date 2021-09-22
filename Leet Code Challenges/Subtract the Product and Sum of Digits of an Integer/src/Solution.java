class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,mult=0;
        while (n != 0){
            int temp = n%10;
            sum+=temp;
            mult*=temp;
            n/=10;
        }
        return mult-sum;
    }
}