class Solution {
    public boolean isHappy(int n) {
        Set<Integer>numberset = new HashSet<>();
        while(n!=1){
            int current =n;
            int sum =0;
            while(current !=0){
                int rem = current %10;
                sum += (rem*rem);
                current /=10; 
            }
            if(numberset.contains(sum)){
                return false;
            }
            n = sum;
            numberset.add(n);
        }
            return true;
        
    }
}