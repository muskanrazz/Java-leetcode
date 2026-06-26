class Solution {
    public List<String> generateParenthesis(int n) {
      ArrayList<String> ans = new ArrayList<>();
 helper(n, "", 0, 0, ans);
 return ans;
    }
    public static void helper(int n, String curr, int lc, int rc, ArrayList<String> ans ){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
        if(lc<n){
            helper(n, curr+"(", lc+1, rc, ans);
        }
        if(rc<lc){
            helper(n, curr+")", lc, rc+1, ans);
        }
    }
 
}