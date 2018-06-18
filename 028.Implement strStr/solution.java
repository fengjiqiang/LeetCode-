class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if(haystack==null || needle==null || n==0)
            return 0;
        if(m<n)
            return -1;
        for(int i=0; i<=m-n; i++){
            boolean flag=true;
            for(int j=0; j<n; j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag)
                return i;
        }
        return -1;
    }
}
