class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb = new StringBuilder(s);
        int i =0, j=sb.length()-1;
        while(i<j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, temp1);
            i++;
            j--;
        }
        String result = sb.toString();
        return result;
    }
}