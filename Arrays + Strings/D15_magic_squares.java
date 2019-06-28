import java.util.*;

public class D15_magic_squares {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] Input = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Input[i][j] = scn.nextInt();
            }
        }
        System.out.print(numMagicSquaresInside(Input));
    }

    // -----------------------------------------------------
    // This is a functional problem. Do not make changes to main
    // This function takes as input an array and integer k.
    // It should print required output.
    public static int numMagicSquaresInside(int[][] grid) {

        int ans = 0;
        for(int i = 1;i<grid.length-1;i++){
            for(int j=1;j<grid[0].length-1;j++){
                if(grid[i][j]==5){
                    if((grid[i+1][j+1]+grid[i-1][j-1]==10) &&
                            (grid[i+1][j-1]+grid[i-1][j+1]==10) &&
                            (grid[i+1][j]+grid[i-1][j]==10) &&
                            (grid[i][j+1]+grid[i][j-1]==10)){
                        ans++;
                    }
                }
            }

        }
        return ans;

    }
}