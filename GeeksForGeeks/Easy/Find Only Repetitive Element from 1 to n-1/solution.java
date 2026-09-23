class Solution {
    public int findDuplicate(int[] arr) {
        long n = arr.length;
        long sum = n*(n-1)/2;
        long asum = 0;
        for(int i=0; i<arr.length; i++){
            asum += arr[i];
        }
        long diff = asum - sum;
        return (int)diff;
        
    }
}