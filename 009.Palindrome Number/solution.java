class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char[] c = s.toCharArray();
        boolean flag=true;
        for(int i=0; i<=c.length/2; i++){
            if(c[i]!=c[c.length-i-1]){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
