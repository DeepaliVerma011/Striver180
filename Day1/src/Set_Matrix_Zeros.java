public class Set_Matrix_Zeros {
    class Solution {
        public void setZeroes(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            int col0=0;
            //int[] dummyrow = new int[n];
            //int[] dummycol = new int[m];

            for(int i=0; i<n; i++){
                if(matrix[i][0]==0) col0=0;
                for(int j=0; j<m; j++){
                    if(matrix[i][j]==0){
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                        //dummyrow[i]=1;
                        //dummycol[j]=1;
                    }
                }
            }

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j] = 0;
                    }


                    if(col0==0){
                        matrix[i][0]=0;
                    }
                }
            }
        }
    }
}
