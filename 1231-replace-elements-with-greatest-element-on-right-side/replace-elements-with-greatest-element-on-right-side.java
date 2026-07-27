class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++)
            {
                int maxi=-1;
                for(int j=i+1;j<n;j++)
                       maxi=Math.max(maxi,arr[j]);

                arr[i]=maxi;
            }
        return arr;
    }
}