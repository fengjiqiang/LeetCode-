
class Solution {
    public boolean isValid(String s) {
        if(s==null || s.length()==0)
            return true;
        if(s.length()%2 == 1)
            return false;
        Stack<Character> st = new Stack<Character>();
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            switch(c[i]){
                case '(':
                case '[':
                case '{':
                    st.push(c[i]);
                    break;
                case ')':
                    if(st.empty())
                        return false;
                    if(st.peek()=='(')
                        st.pop();
                    else if(st.peek()=='[' || st.peek()=='{')
                        st.push(c[i]);
                    else
                        return false;
                    break;
                case ']':
                    if(st.empty())
                        return false;
                    if(st.peek()=='[')
                        st.pop();
                    else if(st.peek()=='(' || st.peek()=='{')
                        st.push(c[i]);
                    else
                        return false;
                    break;
                case '}':
                    if(st.empty())
                        return false;
                    if(st.peek()=='{')
                        st.pop();
                    else if(st.peek()=='[' || st.peek()=='(')
                        st.push(c[i]);
                    else
                        return false;
                    break;
                default:
                    return false;
            }
        }
        return st.empty();
    }
}
