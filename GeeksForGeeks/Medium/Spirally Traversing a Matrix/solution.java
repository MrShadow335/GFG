class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int row = arr.length;
        int col = arr[0].length;
        int fr = 0;
        int lr = row - 1;
        int fc = 0;
        int lc = col - 1;
        while(fr <= lr && fc<=lc){
            for(int i=fc; i<=lc; i++){
                ans.add(arr[fr][i]);
            }
            fr++;
            if(fr>lr || fc>lc) break;
            for(int i=fr; i<=lr; i++){
                ans.add(arr[i][lc]);
            }
            lc--;
            if(fr>lr || fc>lc) break;
            for(int i=lc; i>=fc; i--){
                ans.add(arr[lr][i]);
            }
            lr--;
            if(fr>lr || fc>lc) break;
            for(int i=lr; i>=fr; i--){
                ans.add(arr[i][fc]);
            }
            fc++;
        }
        return ans;
    }
}
