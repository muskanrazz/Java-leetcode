class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : nums1) {
            list.add(num);
        }

        for (int num : nums2) {
            list.add(num);
        }
        Collections.sort(list);

        int n = list.size();
        if(n % 2 == 0) {
             return (list.get(n / 2) + list.get(n / 2 - 1)) / 2.0;
        }
        else{
           return list.get(n / 2);
        }

    }
}