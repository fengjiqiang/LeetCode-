class Solution {
    public int reverse(int x) {
        long result=0;
        while(x!=0){
            result=result*10+(x%10);
            x/=10;
        }
        if(result<Integer.MIN_VALUE || result>Integer.MAX_VALUE)
            result=0;
        return (int)result;
    }
}
