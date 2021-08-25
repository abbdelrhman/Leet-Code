class Solution {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int x2 = points[i + 1][0], y2 = points[i + 1][1], x1 = points[i][0], y1 = points[i][1];
            if (x2 >=x1  ) {
                int x = x1, y = y1;
                while (x < x2 && y < y2) {
                    x++;
                    y++;
                    length++;
                    if (x + 1 == x2 && y + 1 == y2) {
                        length++;
                        x++;
                        y++;
                        break;
                    }
                }
                while (y < y2) {//< m4 akbr
                    y++;
                    length++;
                }
                while (x < x2 && y > y2) {
                    x++;
                    y--;
                    length++;
                    if (x + 1 == x2 && y - 1 == y2) {
                        length++;
                        x++;
                        y--;
                        break;
                    }

                }

                while (y > y2) {
                    y--;
                    length++;
                }
                while (x < x2 ){
                    x++ ;
                    length++;
                }

            }
           else if (x2 < x1) {
                int x = x1, y = y1;
                while (x > x2 && y < y2) {
                    x--;
                    y++;
                    length++;
                    if (x - 1 == x2 && y + 1 == y2) {
                        length++;
                        x--;
                        y++;
                        break;
                    }
                }
                while (y < y2) {
                    y++;
                    length++;
                }
                while (x > x2 && y > y2) {
                    x--;
                    y--;
                    length++;
                    if (x - 1 == x2 && y - 1 == y2) {
                        length++;
                        x--;
                        y--;
                        break;
                    }

                }

                while (y > y2) {
                    y--;
                    length++;
                }
                while (x > x2 ){
                    x-- ;
                    length++;
                }
            }
        }
        return length;
    }


}