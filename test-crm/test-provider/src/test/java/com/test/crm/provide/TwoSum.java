package com.test.crm.provide;

import java.util.Arrays;

public class TwoSum {
	    public static int[] twoSum(int[] nums, int target) {
	    	int [] result = new int[2];
	    	for (int i = 0; i < nums.length; i++) {
	    		for (int j = i+1; j < nums.length; j++) {
					int sum = nums[i]+nums[j];
					if(sum==target){
						result[0]=i;
						result[1]=j;
						break;
					}
				}
				
			}
	    	return result;
	    }
	    
	    public static void main(String[] args) {
	    	int [] nums = {2, 7, 11, 15};
	    	int target = 18;
	    	int[] twoSum = twoSum(nums, target);
	    	System.out.println(Arrays.toString(twoSum));
		}
	    
}
