class Solution {
    public String reverseVowels(String s) {

        String vo = "aeiouAEIOU";

        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        int j = s.length() - 1;

        while(i<j){
            char chi = sb.charAt(i);
            char chj= sb.charAt(j);

            if(vo.contains(String.valueOf(chi)) && vo.contains(String.valueOf(chj))){

                char temp = chi;
                sb.setCharAt(i,chj);
                sb.setCharAt(j,temp);
                i++;
                j--;
            }
            else if(!vo.contains(String.valueOf(chi)) && vo.contains(String.valueOf(chj))){

                i++;
            }
            else if(vo.contains(String.valueOf(chi)) && !vo.contains(String.valueOf(chj))){

                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return sb.toString();

        
    }
}