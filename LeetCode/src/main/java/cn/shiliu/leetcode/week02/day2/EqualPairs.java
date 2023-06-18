package cn.shiliu.leetcode.week02.day2;

/**
 * 每日一题
 * 2352. 相等行列对
 */
public class EqualPairs {
    public static void main(String[] args) {
        //[3,2,1],[1,7,6],[2,7,7]
        //int[][] grid1 = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        //int a = findEqualGrid(grid1);
        int b = equalPairs(grid);
        //System.out.println(a);
        System.out.println(b);
    }
    public static int equalPairs(int[][] grid) {
        //将二维数组的长度进行输出
        int n = grid.length;
        int res = 0;
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        // 计算每一行与每一列的和
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += grid[i][j];
                colSum[j] += grid[i][j];
            }
        }
        // 遍历所有的行列，查找满足条件的行列成对数目
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rowSum[i] == colSum[j]) {
                    res++;
                }
            }
        }
        return res;
    }
}
