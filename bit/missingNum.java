package bit;

class missingNum {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int xorOfn=0, xorOfEle=0;
        for(int i=0;i<=n;i++) xorOfn^=i;
        for(int num:nums) xorOfEle^=num;
        return xorOfn^xorOfEle;
    }
}
/*268. Missing Number
s
Given an array nums containing n distinct numbers in the range [0, n],
 return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 2 is the missing number in the range since it does not appear in nums. */