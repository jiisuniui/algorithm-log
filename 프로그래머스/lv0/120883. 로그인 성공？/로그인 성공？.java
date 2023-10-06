class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean id=false;
        
        for(int i=0; i<db.length; i++){
            if(id_pw[0].equals(db[i][0])){
                id=true;
                if(id_pw[1].equals(db[i][1])){
                    return "login";
                }
            }
        }
        
        if (id){
            return "wrong pw";
        }
        return "fail";
    }
}