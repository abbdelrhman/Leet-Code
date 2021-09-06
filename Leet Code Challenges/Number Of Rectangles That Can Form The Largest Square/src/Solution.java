class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int maxL = 0;
        int SquareLengths[] = new int[rectangles.length];
        for (int i = 0; i < rectangles.length; i++) {
            SquareLengths[i] = Math.min(rectangles[i][0], rectangles[i][1]);
            if (SquareLengths[i] > maxL){
                maxL=SquareLengths[i];
            }
        }
        for (int i=0 ; i<SquareLengths.length ;i++){
            if (SquareLengths[i]==maxL){
                max++;
            }
        }

        return max;
    }
}