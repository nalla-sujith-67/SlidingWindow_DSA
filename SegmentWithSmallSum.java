//according to the description given in the problem a window is said to be a bad window if the sum of the array is greater than k (>k).

import java.util.*;
import java.io.*;

class BeingZero {
    public int segmentWithSmallSum(List<Integer> a, long s) {
        long sum = 0;
        int len = 0;
        int start = 0;

        for (int end = 0; end < a.size(); end++) {
            sum += a.get(end);

            while (sum > s) {
                sum -= a.get(start);
                start++;
            }

            len = Math.max(end - start + 1, len);
        }

        return (sum == 0) ? 0 : len;
    }
}
