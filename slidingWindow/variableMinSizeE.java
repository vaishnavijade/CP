import java.util.*;
class variableMinSizeE {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,temp=0;
        int minSum=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            temp+=nums[r];
            while(temp>=target){
                minSum=Math.min(minSum,r-l+1);
                temp-=nums[l];
                l++;
            }
        }return minSum==Integer.MAX_VALUE?0:minSum;
        
    }
}
/* 209:Minimum Size Subarray Sum
Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0 */