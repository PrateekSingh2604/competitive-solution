class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] result = new char[n][m];

        for(int i=0; i<m; i++){
            for(int j=n-2; j>=0; j--){
                if(box[i][j] == '#'){
                    int k = j;
                    while(k<n-1 && box[i][k+1] == '.'){
                        char temp = box[i][k];
                        box[i][k] = box[i][k+1];
                        box[i][k+1] = temp;  
                        k++;
                    }
                }
            }
        }
        for(int i=m-1; i>=0; i--){
            for(int j=0; j<n; j++){
                result[j][m-i-1] = box[i][j];
            }
        }
        return result;
    }
}
