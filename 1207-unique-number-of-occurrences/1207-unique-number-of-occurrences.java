class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(arr);
        
        int count = 1;
        
        for(int i = 0;i<arr.length -1;i++){
            if(arr[i] != arr[i+1]){
                temp.add(count);
                count = 1;
                if(i == arr.length -2){
                    temp.add(count);
                }
                
            }
            else{
                count++;
                if(i == arr.length-2){
                    temp.add(count);
                }
            }
        }
        Collections.sort(temp);
        for(int i = 0;i<temp.size()-1;i++){
            if(temp.get(i) == temp.get(i+1)){
                return false;
            }
        }
        return true;
        
    }
}