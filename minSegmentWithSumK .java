class BeingZero {
    public int solve(int arr[], int n, long s) {
        int start = 0;
        int end = 0;
        long sum = 0;
        int mini = Integer.MAX_VALUE;

        for (end = 0; end < arr.length; end++) {
            sum += arr[end];

            // It is enough for us that the sum should at least be `s` and then we reduce 
            // the window further to see whether there is a shorter window or not.
            while (sum >= s) {
                mini = Math.min(end - start + 1, mini);
                sum -= arr[start];
                start++;
            }
        }

        // Return -1 if no valid subarray is found, otherwise return the length of the minimum subarray
        return (mini == Integer.MAX_VALUE) ? -1 : mini;
    }
}
