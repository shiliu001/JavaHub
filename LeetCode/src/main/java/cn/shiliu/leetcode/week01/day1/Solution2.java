package cn.shiliu.leetcode.week01.day1;

/**
 * 移除元素
 */
class Solution2 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int i = 0;
        while(i < length){
            if(nums[i] == val){
                nums[i] = nums[length - 1];
                length--;
            }else{
                i++;
            }
        }
        return length;
    }
}

