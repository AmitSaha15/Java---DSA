package recursion.maze_problems;

import java.util.Arrays;

public class AllPathsPrint {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };

        int[][] path = new int[maze.length][maze[0].length];

        all_paths("", maze, 0, 0, path, 1);
    }

    static void all_paths(String p, boolean[][] maze, int row, int col, int[][] path, int step){
        if(row == maze.length-1 && col == maze[0].length-1){
            path[row][col] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);
            System.out.println();
            return;
        }


        if(!maze[row][col]) return;

        // considering this block in my path
        maze[row][col] = false;
        path[row][col] = step;

        if(row < maze.length-1){
            all_paths(p+"D", maze, row+1, col, path, step+1);
        }
        if(col < maze[0].length-1){
            all_paths(p+"R", maze, row, col+1, path, step+1);
        }
        if(row > 0){
            all_paths(p+"U", maze, row-1, col, path, step+1);
        }
        if(col > 0){
            all_paths(p+"L", maze, row, col-1, path, step+1);
        }

        // this line is where the fuction will be over
        // so before the function gets removed, also revert the changes that were made by that function
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
