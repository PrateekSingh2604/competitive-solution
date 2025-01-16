class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int result = 0;
        int n = nums1.length;
        int m = nums2.length;
        
        int xor1 = 0;
        for(int i = 0; i<n; i++){
            xor1 ^= nums1[i];
        }
        int xor2 = 0;
         for(int i = 0; i<m; i++){
            xor2 ^= nums2[i];
         }
        
        return (n%2*xor2)^(m%2*xor1);
    }
}
