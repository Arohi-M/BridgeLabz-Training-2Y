class WordSearch {
    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    static boolean dfs(char[][] grid, int x, int y, String word, int index, boolean[][] visited){
        if(index == word.length()) return true;

        int n = grid.length, m = grid[0].length;

        if(x<0 || y<0 || x>=n || y>=m || visited[x][y] || grid[x][y]!=word.charAt(index))
            return false;

        visited[x][y] = true;

        for(int d=0; d<8; d++){
            if(dfs(grid, x+dx[d], y+dy[d], word, index+1, visited))
                return true;
        }

        visited[x][y] = false;
        return false;
    }
}