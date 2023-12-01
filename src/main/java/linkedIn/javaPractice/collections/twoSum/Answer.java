package linkedIn.javaPractice.collections.twoSum;

import java.util.*;

public class Answer {


  // Return the indices of the numbers in the source list that add up to target

  // Time complexity: O(n)
  static List<Integer> findTwoSum(List<Integer> nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < nums.size(); i++) {
      int complement = target - nums.get(i);
      if (numMap.containsKey(complement)) {
        return List.of(numMap.get(complement), i);
      } else {
        numMap.put(nums.get(i), i);
      }
    }
    return new ArrayList<>();
  }

  // Time complexity: O(n^2)
   static List<Integer> twoSumBruteForce(List<Integer> nums, int target) {
    for (int i = 0; i < nums.size(); i++) {
      for (int j = i + 1; j < nums.size(); j++) {
        if (nums.get(i) + nums.get(j) == target) {
          return List.of(i, j);
        }
      }
    }
    return new ArrayList<>();
  }

  // Time complexity: O(n*log(n))
  static List<Integer> twoSumSorting(List<Integer> nums, int target) {
    Collections.sort(nums);
    int left = 0;
    int right = nums.size() - 1;
    while(left < right) {
      int sum = nums.get(left) + nums.get(right);
      if(sum == target) {
        return List.of(left, right);
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    return new ArrayList<>();
  }
}
