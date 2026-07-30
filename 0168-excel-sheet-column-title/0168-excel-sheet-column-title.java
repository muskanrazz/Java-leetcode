class Solution {
    public String convertToTitle(int columnNumber) {
         String res = "";
    while(columnNumber!= 0) {
        char ch = (char)((columnNumber - 1) % 26 + 65);
        columnNumber = (columnNumber - 1) / 26;
        res = ch + res;
    }
    return res;
    }
}