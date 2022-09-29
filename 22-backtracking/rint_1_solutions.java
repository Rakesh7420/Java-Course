public class rint_1_solutions {

        public static boolean nqueens(char board[][],int row) {
            //base case
            if (row == board.length) {
//                printBoard(board);
                return true;
//                count ++;
            }
            //kaam
            for (int j = 0; j < board.length; j++) {
                if (isSafe(board, row, j)) {
                    board[row][j] = 'Q';
                    if(nqueens(board, row + 1)){ //function call
                        return true;
                    }
                    board[row][j] = 'X'; //backtracking
                }
            }
            return false;
        }

        public static boolean isSafe(char board[][],int row,int col){
            //vertical up
            for(int i=row-1;i>=0;i--){
                if(board[i][col]=='Q'){
                    return false;
                }
            }
            //left diagonal up
            for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
                if(board[i][j]=='Q') {
                    return false;
                }
            }
            //right digonal up
            for(int i=row-1,j=col+1;i>=0 &&j< board.length; i--,j++){
                if(board[i][j]=='Q'){
                    return  false;
                }
            }
            return true;
        }

        public static void printBoard(char board[][]){
            System.out.println("---------- chess board ----------");
            for(int i=0;i<board.length;i++){
                for(int j=0;j< board.length;j++){
                    System.out.print(board[i][j]+" " );
                }
                System.out.println();
            }
        }
        static int count=0;
        public static void main(String[] args) {
            int n=4;
            char board[][]=new char[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j< n;j++){
                    board[i][j]='X';
                }
            }
            if(nqueens(board,0)){
                System.out.println("Solution is possible");
                printBoard(board);
            }else{
                 System.out.println("solution is not possible");
            }
        }

}
