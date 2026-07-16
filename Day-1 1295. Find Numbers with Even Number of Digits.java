class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i:nums){
         String s=Integer.toString(i);
         if(s.length()%2==0){
            c++;
         }
        }
        return c;
    }
}
