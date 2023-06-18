package cn.shiliu.leetcode.week02.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * /**
 *
 * @author: shiliu
 * @date: 2023/6/6
 * @description:
 * @version: 1.0
 */
public class a {

        public int[][] findEqualGrid(int[][] grid) {
            //将二维数组的长度进行输出
            int n = grid.length;
            //定义行加和
            int[] rowSum = new int[n];
            //定义列加和
            int[] colSum = new int[n];

            // 统计行和列的和
            //行指针
            for (int i = 0; i < n; i++) {
                //列指针
                for (int j = 0; j < n; j++) {
                    //行加和
                    rowSum[i] += grid[i][j];
                    //列加和
                    colSum[j] += grid[i][j];
                }
            }
            // 遍历所有的行和列，找出满足条件的行列对
            List<int[]> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (rowSum[i] == colSum[j]) {
                        list.add(new int[]{i, j});
                    }
                }
            }
            // 转换为二维数组返回
            return list.toArray(new int[0][]);
        }


}
