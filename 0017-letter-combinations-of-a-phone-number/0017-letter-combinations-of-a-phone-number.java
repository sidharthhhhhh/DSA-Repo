class Solution {
    static String[] codes = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> Combinations(List<String> ans,String digits,String sub) {

        if(digits.length() == 0){
            ans.add(sub);
            return ans;

        }

        char ch = digits.charAt(0);
        String str = digits.substring(1);

        String chcode = codes[ch -'0'];
        for(int i = 0;i<chcode.length();i++){
            char chh = chcode.charAt(i);
            Combinations(ans,str,sub+chh);
            
        }
        return ans;
    }
    public List<String> letterCombinations(String digits) {

        List<String> bres = new ArrayList<>();

        if(digits.length() == 0){  
            return bres;

        }
        else{
            return Combinations(bres,digits,"");
        }
    }
}