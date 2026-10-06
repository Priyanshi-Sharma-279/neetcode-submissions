class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;


        for(int i = 0; i < n ; i++){
            for(int j= 0; j < m; j++){
                if(grid[i][j] == '1'){
                    bfs(grid,i,j);
                    count++;

                }
            }
        }
        return count;
        
    }

    public void bfs(char[][] grid, int i , int j){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i,j});

        grid[i][j] = '0';


        int[][] dirs = {
            {1,0},
            {-1,0},
            {0,1},
            {0,-1}
        };

        while(!q.isEmpty()){
            int[] curr = q.poll();

            for(int[] dir : dirs){
            int x = dir[0] + curr[0];
            int y = dir[1] + curr[1];

            while(x >= 0 && y >= 0 && x < grid.length && y < grid[0].length && grid[x][y] == '1'){
                grid[x][y] = '0';
                q.offer(new int[]{x,y});
            }


        }
        }


        


    }
}
