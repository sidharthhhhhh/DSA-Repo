class Solution {
    public int compress(char[] chars) {

        if(chars.length == 1){
            return 1;
        }

        String s = "";
        int count = 1;

        for(int i = 0;i<chars.length - 1;i++){

            if(chars[i] != chars[i+1]){
                s+=chars[i];
                if(count > 1){
                    s+= count;
                }
                if(i == chars.length-2){
                    s += chars[i+1];
                }
                count = 1;

            }
            else{
                count++;
                if(i == chars.length -2){
                    s += chars[i];
                    s+=count;
                }
            }
        }
        
        

        for(int i = 0;i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }
}