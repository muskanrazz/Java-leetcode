class Solution {
       public static int reverse(int rev,int n){
        if(n<=0) return rev;
        return reverse(rev*10+n%10,n/10);
    }
    public boolean isPalindrome(int x) {
       int rev=0;
    //    reverse(rev,x);
       if(reverse(rev,x)==x) return true;
       else return false;

    }
}