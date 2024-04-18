class Solution {
    public int solution(String my_string, String is_suffix) {
        int str_len = my_string.length();
        int suf_len = is_suffix.length();
        if(str_len<suf_len){
            return 0;
        }else if(str_len==suf_len){
            if(my_string.equals(is_suffix)){
                return 1;
            }
        }else{
            String end = my_string.substring(str_len-suf_len,str_len);
            if(end.equals(is_suffix)){
                return 1;
            }
        }
        return 0;
    }
}