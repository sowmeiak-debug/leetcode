class Solution {
    public String defangIPaddr(String address) {
        int len=address.length();
        String s="";
        for(int i=0;i<len;i++){
            char ch=address.charAt(i);
            if(ch=='.')
            s+="[.]";
            else
            s+=ch;
        }
        return s;
    }
}