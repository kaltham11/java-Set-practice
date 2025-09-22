import java.util.HashSet;
import java.util.Set;

class SequenceFinder {
    /**
     * TO-DO: Find the length of the longest consecutive sequence of numbers in an array.
     * This must be implemented in O(n) time complexity.
     \*
     * @param nums An unsorted array of integers.
     * @return The length of the longest sequence.
     */
    public int longestConsecutiveSequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Your code here
        // For each number in the set...
        // Check if it is the start of a new sequence (i.e., num - 1 is NOT in the set).
        // If it is, start counting how many consecutive numbers (num + 1, num + 2, etc.) are in the set.
        // Keep track of the maximum count found.
        int currentLength=0;
        for(Integer num:numSet){
            if (!(numSet.contains(num-1))){
                int currentNum=num;
                 currentLength=1;
                    while (numSet.contains(currentNum + 1)) {
                        currentLength++;
                        currentNum++;

                    }
                }
            longestStreak=Math.max(longestStreak,currentLength);
            }


        return longestStreak;
    }
}