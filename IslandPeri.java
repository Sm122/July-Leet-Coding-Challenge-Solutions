class Solution {
    public int islandPerimeter(int[][] grid) {
        int peri=0;
     for(int i =0;i<grid.length;i++)
     {
         for(int j=0;j<grid[0].length;j++)
         {
             if(grid[i][j]==1)
             {
                 peri+=4;
                 if(i>0)
                     peri-=grid[i-1][j];
                 if(i<grid.length-1)
                     peri-=grid[i+1][j];
                 if(j>0)
                     peri-=grid[i][j-1];
                 if(j<grid[0].length-1)
                     peri-=grid[i][j+1];
             }
         }
     }
        return peri;
    }
}