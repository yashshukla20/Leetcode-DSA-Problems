class Solution {
    public int pivotInteger(int n) {
        int rsum = 0, lsum = 0;
        for(int i=1; i<=n; i++) {
            rsum += i;
        }

        for(int i=1; i<=n; i++) {
            rsum -= i;
            if(rsum == lsum) {
                return i;
            } else {
                lsum += i;
            }
        }
        return -1;
    }
}