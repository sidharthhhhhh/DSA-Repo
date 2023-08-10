class Solution {
    public long totalCost(int[] costs, int k, int candidates) {

        long sum = 0;

        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int p1 = 0;
        int p2 = 0;

        if(costs.length > candidates*2){
            for(p1 = 0;p1<candidates;p1++){
                left.add(costs[p1]);
            }
            for(p2 = costs.length-1;p2>=costs.length - candidates;p2--){
                right.add(costs[p2]);
            }

        }
        else{
            for(p1 = 0;p1<candidates;p1++){
                left.add(costs[p1]);
            }
            for(p2 = costs.length-1;p2>=p1;p2--){
                right.add(costs[p2]);
            }

        }
        // System.out.println(p1);
        // System.out.println(p2);
        

        int i = 0;

        while(i != k && left.size() >0 && right.size() >0){
            int t1 = left.peek();
            int t2 = right.peek();

            if(t1 < t2){
                sum += left.remove();
                if(p1<= p2){
                    left.add(costs[p1]);
                    p1++;
                }
            }
            else if(t1 == t2){
                sum += left.remove();
                if(p1<=p2){
                    left.add(costs[p1]);
                    p1++;
                }
            }
            else{
                sum += right.remove();
                if(p2>=p1){
                    right.add(costs[p2]);
                    p2--;
                }
            }
            i++;
            
        }
        while(i != k && left.size()  >0){
            sum += left.remove();
            i++;

        }
        while(i != k && right.size()  >0){
            sum += right.remove();
            i++;

        }
        // System.out.println(left);
        // System.out.println(right); 
        // System.out.println(i); 
        return sum;


    }
}