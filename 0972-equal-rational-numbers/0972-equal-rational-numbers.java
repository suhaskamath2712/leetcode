class Solution {
    public boolean isRationalEqual(String s, String t) {
        return Num(s) == Num(t);
    }
    public double Num(String s){
        int idx = -1;
        for(int i = 0; i<s.length(); i++){
            if(idx == -1 && s.charAt(i) == '('){
                idx = i;
                break;
            }
        }
        if(idx > 0){
            String base = s.substring(0 , idx);
            String decimal = s.substring(idx+1 , s.length() - 1);
            StringBuilder sb = new StringBuilder(base);
            for(int i=0; i<25; i++){
                sb.append(decimal);
            }
            return Double.valueOf(sb.toString());
        }
        return Double.valueOf(s);
    }
}