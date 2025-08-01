class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList());
        res.get(0).add(1);
        if(numRows == 1){
            return res;
        }

        res.add(new ArrayList());

        res.get(1).add(1);
        res.get(1).add(1);

        for(int i = 1; i<numRows-1; i++){

            res.add(new ArrayList());
            res.get(i+1).add(1);

            for(int j = 1; j<res.get(i).size(); j++){
                res.get(i+1).add(res.get(i).get(j-1) + res.get(i).get(j));
            }
            res.get(i+1).add(1);
        }

        return res;

    }
}
