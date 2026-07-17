class Solution {
    public long sumAndMultiply(int n) {
        long sum =0;
        int rev =0;

        while(n!=0){
            int rem = n%10; 
            if(rem!=0){
                rev = rev * 10 +rem;
            }
            sum = sum + rem;
            n= n/10;
        }
        int rev1= 0;
        while(rev!=0){
            rev1= rev1 *10 + rev%10;
            rev = rev/10;
        }
        return (long)rev1*sum;

    }
}