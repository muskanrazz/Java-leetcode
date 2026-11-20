class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
int pointer = n-1;
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                pointer = i;
                break;
            } else
                pointer--;
        }
        int count = 0;
        // while (s.charAt(pointer) != ' ') {
        //     count++;
        //     pointer--;
        // }
        for(int i = pointer ;i>=0;i--){
            if(s.charAt(i) != ' ') count++;
            else break;
        }

        return count;
    }
}