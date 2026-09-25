class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int lo = 0;
        int hi = arr.length -1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            int correctNo = mid + 1;
            int miss = arr[mid] - correctNo;
            if(miss<k){
                lo = mid + 1;
            }
            else hi = mid - 1;
        }
        return hi + 1 +k;
    }
}