class Solution {
    public boolean detectCapitalUse(String word) {
        int u_c=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                u_c++;
            }

        }
        return u_c == word.length() || u_c ==0
               || (u_c==1 && Character.isUpperCase(word.charAt(0)) );
    }
}