class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length()){ 
        return false;
     }
     else{  
      for(int i=0;i<s.length;i++){
        for(int j=0;j<t.length;j++){
           
            if(s[i]==t[j]){
                return true;
            }else{
                return false;
            }
        }
       } 
      } 
    }
     
}
