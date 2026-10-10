class Solution {
    public String maxNumber(int arr[]) {
        // code here.
        long largest=0;
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length -1; i>=0; i--){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}