class Solution {
    public String removeStars(String s) {
        char c = '*';
        // int in = -1;
//         StringBuilder ans = new StringBuilder();
      

//         if(s.length() == 0){
//             return ans.toString();
//         }

//         for(int i = 0;i<s.length();i++){
//             if(s.charAt(i) == c){
//                 ans.deleteCharAt(in);
//                 in--;

//             }
//             else{
//                 ans.append(s.charAt(i));
//                 in++;
//             }
//         }
//         return ans.toString();
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == c){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String ans = "";
        while(st.size() > 0){
            ans = st.pop() + ans;
        }
        return ans;

    }
}