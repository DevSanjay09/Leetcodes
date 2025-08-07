import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (map.containsKey(complement)) {
                // +1 for 1-based indexing
                return new int[]{map.get(complement) + 1, i + 1};
            }

            // Store the current number and its index
            map.put(numbers[i], i);
        }

        // If no solution is found (guaranteed by problem there will be one)
        return new int[]{-1, -1};
    }
}
// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int left = 0;
//         int right = numbers.length - 1;

//         while (left < right) {
//             int sum = numbers[left] + numbers[right];

//             if (sum == target) {
//                 return new int[]{left + 1, right + 1}; // 1-based indexing
//             } else if (sum < target) {
//                 left++; // Need a bigger number
//             } else {
//                 right--; // Need a smaller number
//             }
//         }

//         return new int[]{-1, -1}; // Just in case, although the problem says one solution exists
//     }
// }
