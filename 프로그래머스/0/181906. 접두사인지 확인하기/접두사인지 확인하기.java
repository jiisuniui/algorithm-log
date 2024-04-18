class Solution {
    public int solution(String my_string, String is_prefix) {
        int str_len = my_string.length();
        int pre_len = is_prefix.length();
        if(str_len<pre_len){
            return 0;
        }else if(str_len==pre_len){
            if(my_string.equals(is_prefix)){
                return 1;
            }
        }else{
            String start = my_string.substring(0,pre_len);
            if(start.equals(is_prefix)){
                return 1;
            }
        }
        return 0;
    }
}
