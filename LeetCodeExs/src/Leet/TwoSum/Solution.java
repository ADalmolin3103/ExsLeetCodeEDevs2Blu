package Leet.TwoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2]; 
        for (int i = 0; i < nums.length; i++) {
            
            for ( int j = 0; j < nums.length; j++) {

                if(i != j){
                    if( nums[i]+nums[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return null;
    }
}