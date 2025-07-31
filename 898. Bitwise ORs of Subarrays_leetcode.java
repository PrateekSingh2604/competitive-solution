class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> prev = new HashSet<>();
        int n = arr.length;
        HashSet<Integer> res = new HashSet<>();

        for (int i = 0; i < n; i++) {
            HashSet<Integer> curr = new HashSet<>();
            Iterator<Integer> it = prev.iterator();

            while (it.hasNext()) {
                int x = it.next();
                curr.add(x | arr[i]);
                res.add(x | arr[i]);
            }

            curr.add(arr[i]);
            res.add(arr[i]);

            prev = curr;
        }
        return res.size();
    }

}
