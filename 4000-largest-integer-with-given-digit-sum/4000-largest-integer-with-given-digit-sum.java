class Solution {
    public int largestInteger(int n, int s) {
         if (s > n * 9) {
            return -1;
        }

        int ans = 0;

        while (n > 0) {
            int x = Math.min(s, 9);
            ans = ans * 10 + x;
            s = s - x;
            n--;
        }

        return ans;
    }
}