package prog;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
    
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[0] = map.get(target - nums[i]);
				result[1] = i;
				break;
			}
			map.put(nums[i], i);
		}
		
		return result;
    }
	
	public int[] twoSum_4ms(int[] nums, int target) {
		
		// find min number and max number
		int numMin = Integer.MAX_VALUE;
		int numMax = Integer.MIN_VALUE;
		
		for (int num : nums) {
			if (num < numMin) numMin = num;
			if (num > numMax) numMax = num;
		}
		
		// find min target number and max target number
		int min = target - numMax;
		int max = target - numMin;
		
		int targetMin = min < numMin ? numMin : min;
		int targetMax = max > numMax ? numMax : max;
		
		// init index array
		int[] numIndex = new int[targetMax - targetMin + 1];
		
		for (int i = 0; i < numIndex.length; i++) {
			numIndex[i] = -1;
		}
		
		// iterate number array to save index for potential numbers
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= targetMin && nums[i] <= targetMax) {
				int offset = -targetMin;
				if (numIndex[(target - nums[i]) + offset] != -1) {
					return new int[] {numIndex[(target - nums[i]) + offset], i};
				}
				else {
					numIndex[nums[i] + offset] = i;
				}
			}
		}
		
		return new int[] {0, 0};
	}
}
