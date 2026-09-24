class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        int i =0; 
        int j = 0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                set.add(a[i]);
                i++;
            }
            else if(a[i] == b[j]){
                set.add(a[i]);
                i++;
                j++;
            }
            else{
                set.add(b[j]);
                j++;
            }
        }
        if(i<a.length){
            while(i<a.length){
                set.add(a[i]);
                i++;
            }
        }
        if(j<b.length){
            while(j<b.length){
                set.add(b[j]);
                j++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);
        return ans;
    }
}
