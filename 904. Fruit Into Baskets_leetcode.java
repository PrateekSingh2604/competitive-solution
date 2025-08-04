class Solution {
    public int totalFruit(int[] fruits) {
        int fruitOne = -1;
        int fruitTwo = -1;

        int n = fruits.length;

        int sum = 0;

        int countOne = 0;
        int countTwo = 0;

        int j = n-1;

        for(int i = n-1; i>=0; i--){

            if(fruitOne == -1 || fruitOne == fruits[i]){
                fruitOne = fruits[i]; 
                countOne++; 
            }
            else if(fruitTwo == -1 || fruitTwo == fruits[i]){
                fruitTwo = fruits[i]; 
                countTwo++; 
            }
            else{
                while(countOne > 0 && countTwo > 0){
                    if(fruitOne == fruits[j]){
                        countOne--;
                        j--;
                    }else{
                        countTwo--;
                        j--;
                    }
                }

                if(countOne == 0){
                    fruitOne = fruits[i];
                    countOne++;
                }else{
                    fruitTwo = fruits[i];
                    countTwo++;
                }
            }

            sum = Math.max(sum, countOne + countTwo);

        }

        return sum;
    }
}
