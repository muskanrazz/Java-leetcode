class Solution {
    public char findTheDifference(String s, String t) {
        char[] arr1= s.toCharArray();
        char[] arr2= t.toCharArray();
    //   int n= s.length;
    //   int m= t.length;
      int xor1=0;

      for(int i=0; i<arr1.length; i++){
        xor1= xor1^ arr1[i];
      }
      
        for(int i=0; i<arr2.length; i++){
            xor1= xor1 ^ arr2[i];
        }
      return (char)(xor1);

    }
}