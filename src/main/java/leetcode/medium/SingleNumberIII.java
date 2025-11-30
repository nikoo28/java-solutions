package leetcode.medium;

public class SingleNumberIII {

    int[] singleNumberIII(int[] nums) {

        int xored = 0;
        for (int num : nums)
            xored ^= num;

        // Find exclusive bit
        int exbit = 0;
        while (true) {
            if ((xored & 1) == 1)
                break;
            xored = xored >> 1;
            exbit++;
        }

        int setBucket = 0;
        int unsetBucket = 0;
        for (int num : nums)
            // If the bit is set, move to set bucket
            if (((num >> exbit) & 1) == 1)
                setBucket ^= num;
            else
                unsetBucket ^= num;

        return new int[]{setBucket, unsetBucket};
    }
}
