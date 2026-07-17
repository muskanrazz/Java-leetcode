class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        int count=0;

        for(int i=n-1; i>=0; i--){
             char ch = s.charAt(i);
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
            else{
                break;
            }
        }
        return s.substring(0, n-count);
    }
}