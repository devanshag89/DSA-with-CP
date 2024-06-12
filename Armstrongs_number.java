class Solution {
    static String armstrongNumber(int n){
        // code here
        int t = n;
        int s = 0;
        while(n>0){
            int r = n%10;
            s=s+(int)Math.pow(r,3);
            n = n/10;
        }
        if(s==t) return "Yes";
        else return "No";
    }
}
