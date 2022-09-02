public class transpose {
    public static void row_to_col(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
             System.out.println(matrix[j][i]);
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{11,12,13},{21,22,23}};
       row_to_col(matrix);
    }
}
