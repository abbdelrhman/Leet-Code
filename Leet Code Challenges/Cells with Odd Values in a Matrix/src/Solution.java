class Solution {
    public static int oddCells(int m, int n, int[][] indices) {
        int arr[][] = new int[m][n];

        for (int i=0 ; i<indices.length;i++){
            int r=indices[i][0],c=indices[i][1];
            for (int k=0 ; k<n ; k++){
                arr[r][k]++;
            }
            for (int k=0 ; k<m ; k++){
                arr[k][c]++;
            }
        }
        int odd=0;
        for (int i=0 ; i<m ; i++){
            for (int j=0 ; j<n ;j++){
                if (arr[i][j]%2 !=0){
                    odd++;
                }
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        System.out.println(oddCells(2,3,new int[][]{{0,1},{1,1}}));
    }
}