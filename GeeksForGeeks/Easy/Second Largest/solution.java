class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int sMax = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int i =0; i<arr.length; i++){
            if(sMax < arr[i] && arr[i] != max){
                sMax = arr[i];
            }
        }
        if(sMax == Integer.MIN_VALUE) return -1;
        return sMax;
    }
}