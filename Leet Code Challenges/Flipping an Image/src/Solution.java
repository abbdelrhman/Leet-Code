class Solution {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int row = 0 ; row < image.length  ;row++){
            int i=0 , j=image[0].length-1;
            while (i<=j){
                int temp = image[row][i];
                image[row][i]=image[row][j];
                image[row][j]=temp;
                i++;
                j--;
            }
        }
        for (int i=0 ; i<image.length ; i++){
            for (int j=0 ; j<image[0].length ; j++){
                image[i][j] = image[i][j] == 0 ? 1 : 0 ;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(flipAndInvertImage(arr));
    }
}