import java.util.Arrays;

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length-1; i++) {
            if((isOdd(i) && !isOdd(A[i])) ){
                for(int j = i+1 ; j<A.length ; j++){
                    if((isEven(j) && !isEven(A[j]))){
                        swap(i,j,A);
                    }
                }
            }
            if(isEven(i) && !isEven(A[i])){
                for(int j=i+1; j<A.length;j++){
                    if(isOdd(j)&&!isOdd(A[j])){
                        swap(i,j,A);
                    }
                }
            }
        }
        return A;
    }

    private boolean isEven(int num) {
        return (num % 2 == 0) ? true : false;
    }

    private boolean isOdd(int num) {
        return (num % 2 != 0) ? true : false;
    }

    private void swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        System.out.println(solution.isOdd(1));
//        int arr[] = {0,4,0,1,1,1};
//        System.out.println(Arrays.toString(solution.sortArrayByParityII(arr)));
//    }
}