class Solution {
    public long dividePlayers(int[] skill) {
        int n =skill.length;
        Arrays.sort(skill);
         int low = 0;
         int high = n-1;
        long ans = 0;
        long set = skill[low] + skill[high];
        while ( low < high ){
            long diff = skill[low] + skill[high];
            ans += skill[low] * skill[high];
            low++;
            high--;
            if ( set != diff ) return -1;
        }
        return ans;
    }
}