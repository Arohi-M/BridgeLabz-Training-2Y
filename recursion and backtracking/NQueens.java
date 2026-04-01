class NQueens {
    static boolean solve(int n, int row, int[] board){
        if(row == n){
            return true;
        }

        for(int col=0; col<n; col++){
            boolean safe = true;
            for(int i=0;i<row;i++){
                if(board[i]==col || Math.abs(board[i]-col)==Math.abs(i-row)){
                    safe=false;
                    break;
                }
            }

            if(safe){
                board[row]=col;
                if(solve(n,row+1,board)) return true;
            }
        }
        return false;
    }
}