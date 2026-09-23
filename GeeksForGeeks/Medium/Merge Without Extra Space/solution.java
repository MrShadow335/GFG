class Solution {
    public void mergeArrays(int a[], int b[]) {
        int i = a.length -1;
        int j=0;
        while(i >= 0 && j < b.length){
            if(b[j] < a[i]){
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i--;
                j++;
            }
            else{
                i--;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
