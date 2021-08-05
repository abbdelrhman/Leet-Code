class Solution {
    public static int maxSubArray(int[] nums) {
    return maxSubArrayDivideAndConquer(nums,0,nums.length-1) ;
    }
    static int maxSubArrayDivideAndConquer(int[] A, int l, int r){
        if (l==r){
            return A[l];
        }
        int mid = (l + r)/2;
        int left = maxSubArrayDivideAndConquer(A,l,mid);
        int rigt = maxSubArrayDivideAndConquer(A,mid+1,r);
        int crossing = maxCorssing(A,l,mid,r);
        return Math.max(Math.max(left,rigt),crossing);

    }

    private static int maxCorssing(int[] a, int l, int mid, int r) {
        int maxLeft=Integer.MIN_VALUE,maxRight=Integer.MIN_VALUE;
        int i=mid;
        int j=mid+1;
        int leftIndex=mid;
        int RightIndex=mid+1;

        int runningWindow = 0;
        while (i>=l){
            runningWindow+=a[i];
            int temp = maxLeft ;
            maxLeft=Math.max(maxLeft,runningWindow);
            if (temp!=maxLeft){
                leftIndex=i;
            }
            i--;
        }
        runningWindow=0;
        while (j<=r){
            runningWindow+=a[j];
            int temp = maxRight ;
            maxRight=Math.max(maxRight,runningWindow);
            if (temp!=maxLeft){
                RightIndex=j;
            }
            j++;
        }
        return Math.max(maxLeft+maxRight,Math.max(maxLeft,maxRight));
    }

    public static void main(String[] args) {
        int []nums = {-1,3,4,-5,9,-2};
        System.out.println(maxSubArrayDivideAndConquer(nums,0,nums.length-1));
//        int i=0 , j=0 ;
//        int maxSubArray =Integer.MIN_VALUE;
//        int n= nums.length;
//        for (int left=0 ; left<n ; left++){
//            int runningWindow=0 ;
//            for (int right=left ; right<n;right++){
//                runningWindow+=nums[right];
//                int temp =maxSubArray;
//                maxSubArray=Math.max(maxSubArray,runningWindow);
//                if (temp!=maxSubArray){
//                    i=left;
//                    j=right;
//                }
//            }
//        }
//        System.out.println(i+" "+j);
//        System.out.println(maxSubArray);
    }
}