class Solution {
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        int n= mat1.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            ans.add(new ArrayList<Integer>());
            for(int j=0; j<n; j++){
                int sum = 0;
                for(int k=0; k<n; k++){
                    sum+= mat1[i][k] * mat2[k][j];
                }
                ans.get(i).add(sum);
            }
        }
        return ans;
    }
}