package recursion.maze_problems;


public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        pathsRes("", maze, 0, 0);
    }

    static void pathsRes(String p, boolean[][] maze, int row, int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }


        if(!maze[row][col]) return;

        if(row < maze.length-1){
            pathsRes(p+"D", maze, row+1, col);
        }
        if(col < maze[0].length-1){
            pathsRes(p+"R", maze, row, col+1);
        }
    }
}
