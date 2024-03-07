package recursion.maze_problems;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };

        all_paths("", maze, 0, 0);
    }

    static void all_paths(String p, boolean[][] maze, int row, int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }


        if(!maze[row][col]) return;

        // considering this block in my path
        maze[row][col] = false;

        if(row < maze.length-1){
            all_paths(p+"D", maze, row+1, col);
        }
        if(col < maze[0].length-1){
            all_paths(p+"R", maze, row, col+1);
        }
        if(row > 0){
            all_paths(p+"U", maze, row-1, col);
        }
        if(col > 0){
            all_paths(p+"L", maze, row, col-1);
        }

        // this line is where the fuction will be over
        // so before the function gets removed, also revert the changes that were made by that function
        maze[row][col] = true;
    }
}
