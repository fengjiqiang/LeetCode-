class Solution {
    public int romanToInt(String s) {
        int result=0;
        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            switch(c[i]){
                case 'I':
                    if(i!=c.length-1){
                        if(c[i+1]=='V'){
                            result += 4;
                            i+=1;
                        }
                        else if(c[i+1]=='X'){
                            result += 9;
                            i+=1;
                        }
                        else
                            result += 1;
                    }
                    else
                        result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if(i!=c.length-1){
                        if(c[i+1]=='L'){
                            result += 40;
                            i+=1;
                        }
                        else if(c[i+1]=='C'){
                            result += 90;
                            i+=1;
                        }
                        else
                            result += 10;
                    }
                    else
                        result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if(i!=c.length-1){
                        if(c[i+1]=='D'){
                            result += 400;
                            i+=1;
                        }
                        else if(c[i+1]=='M'){
                            result += 900;
                            i+=1;
                        }
                        else
                            result += 100;
                    }
                    else
                        result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;     
            }
        }
        return result;
    }
}
