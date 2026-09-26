class Solution {
    String modify(String s) {
        if(Character.isUpperCase(s.charAt(0))){
            s=s.toUpperCase();
        }
        else{
            s=s.toLowerCase();
        }
        return s;
    }
}