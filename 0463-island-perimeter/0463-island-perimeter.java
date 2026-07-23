class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    // Assume 4 exposed edges
                    perimeter += 4;

                    // Check top neighbor
                    if (r > 0 && grid[r - 1][c] == 1) {
                        perimeter -= 2;
                    }

                    // Check left neighbor
                    if (c > 0 && grid[r][c - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }
}