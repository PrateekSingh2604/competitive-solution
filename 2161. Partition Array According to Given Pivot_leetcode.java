class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            if(nums[i] < pivot){
                smaller.add(nums[i]);
            }else if(nums[i] > pivot){
                larger.add(nums[i]);
            }else{
                equal.add(nums[i]);
            }
        }
        int j = 0;
        for(int i = 0; i<smaller.size(); i++){
            nums[j] = smaller.get(i);
            System.out.println(smaller.get(i));
            j++;
        }
        for(int i = 0; i<equal.size(); i++){
            nums[j] = equal.get(i);
            j++;
        }
        for(int i = 0; i<larger.size(); i++){
            nums[j] = larger.get(i);
            j++;
        }
        return nums;
    }
}
