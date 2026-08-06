class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.toLowerCase().replaceAll("[^a-z0-9]","");

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();

        return(str.equals(rev));
                
    }
}