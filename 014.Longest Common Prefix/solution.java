
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];
        String result = strs[0];
        for(int i=1; i<strs.length; i++){
            int len=0;
            if(result.length()>strs[i].length())
                len=strs[i].length();
            else
                len=result.length();
            int j=0;
            for(j=0; j<len; j++){
                if(result.charAt(j)!=strs[i].charAt(j))
                    break;
            }
            result=result.substring(0, j);
        }
        return result;
    }
}
