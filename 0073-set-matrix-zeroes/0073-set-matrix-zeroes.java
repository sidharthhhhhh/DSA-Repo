class Solution {
    public void setZeroes(int[][] matrix) {

        List<List<Integer>> loc = new ArrayList<>();

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){

                if (matrix[i][j] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    loc.add(temp);
                }
            }
        }


        for(int i = 0;i<loc.size();i++){
            int k = loc.get(i).get(0);
            int m = loc.get(i).get(1);
            for(int j = k, z = 0;z<matrix[0].length;z++){
                matrix[j][z] = 0;       
            }
            for(int j = 0, z = m;j<matrix.length;j++){       
                matrix[j][z] = 0;           
            }
        }

        
            
        
    }
}