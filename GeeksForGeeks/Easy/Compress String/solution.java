class Solution {
    public String compressString(String s) {
        // code here
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        int i=0, j=0;
        while(j<sb.length()){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);
            if(ch1 == ch2){
                j++;
            }
            else{
                ans.append(ch1);
                ans.append(j-i);
                i=j;
            }

        }
        ans.append(sb.charAt(i));
        ans.append(j - i);
        return ans.toString();
    }
}