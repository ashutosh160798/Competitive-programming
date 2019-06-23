import java.util.*;
class D13_k_closest_point_to_origin {

    // -----------------------------------------------------
    // This is a functional problem. Do not change main
    // This function takes as input a 2d array and k value
    // It should return required output as 2d array
    public static int[][] kClosest(int[][] points, int K) {
        PriorityQueue<Point> pq = new PriorityQueue<>(new closestPointComparator());
        for(int i=0;i<points.length;i++){
            pq.add(new Point(points[i][0],points[i][1]));
        }
        int[][] ans = new int[K][2];
        while (K--!=0){
            Point pop = pq.remove();
            ans[K][0]=pop.x;
            ans[K][1]=pop.y;
        }

        return ans;

    }

    static class closestPointComparator implements Comparator <Point>{

        @Override
        public int compare(Point o1, Point o2) {
            return (int)((Math.pow(o1.x,2)+Math.pow(o1.y,2))-(Math.pow(o2.x,2)+Math.pow(o2.y,2)));
        }
    }

    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int row=scn.nextInt();
        int[][] points= new int[row][2];
        for(int i=0;i<row;i++){
            for(int j=0;j<2;j++){
                points[i][j]=scn.nextInt();
            }
        }
        int k= scn.nextInt();
        int[][] res=kClosest(points,k);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<2;j++)
                System.out.print(res[i][j]+" ");
            System.out.println();
        }
    }

    static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}