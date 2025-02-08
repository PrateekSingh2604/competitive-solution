class NumberContainers {
    private Map<Integer, TreeSet<Integer>> numberToIndex = new HashMap<>();
    private Map<Integer, Integer> indexToNumber = new HashMap<>();

    public NumberContainers() {
        
    }
    
    public void change(int index, int number) {
        if(indexToNumber.containsKey(index)){
            int curr = indexToNumber.get(index);
            numberToIndex.get(curr).remove(index);
            if(numberToIndex.get(curr).isEmpty()){
                numberToIndex.remove(curr);
            }

        }
        indexToNumber.put(index, number);
        numberToIndex.putIfAbsent(number, new TreeSet<>());
        numberToIndex.get(number).add(index);
    }
    
    public int find(int number) {
        if(numberToIndex.containsKey(number)){
            return numberToIndex.get(number).first();

        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
