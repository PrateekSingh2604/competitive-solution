class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i<n; i++){
            map.put(2*arr[i], i);
        }
        
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i]) && map.get(arr[i]) != i){
                return true;
            }
        }
        return false;
    }
}
