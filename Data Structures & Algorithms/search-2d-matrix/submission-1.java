class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length-1;
        while(top<=bottom){
            int mid = (top + bottom) / 2;
            System.out.println("mid: " + mid);
            // int[] tempArr = matrix[mid];
            int l = 0;
            int r = matrix[mid].length-1;
            while(l<=r){
                int mid1= (l + r)/2;
                System.out.println("mid1: " + mid1);
                if(matrix[mid][mid1] == target){
                    return true;
                } else if(matrix[mid][mid1] > target){
                    r = mid1 -1;
                } else {
                    l = mid1+1;
                }
            }
            if(matrix[mid][0] > target && matrix[mid][matrix[0].length-1] > target){
                bottom = mid-1;
            } else {
                top = mid + 1;
            }
        }
        return false;
    }
}
