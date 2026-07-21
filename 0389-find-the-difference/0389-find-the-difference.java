class Solution {
    public char findTheDifference(String s, String t) {
        char[] top = t.toCharArray();
        char[] sop=s.toCharArray();
        long sum=0, diff=0;
        for(char c: top){
            sum+=c;
        }
        for(char c:sop){
            diff+=c;
        }
        return (char)(sum-diff);
    }
}