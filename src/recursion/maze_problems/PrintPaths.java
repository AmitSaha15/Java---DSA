package recursion.maze_problems;

import java.util.ArrayList;
import java.util.List;

public class PrintPaths {
    public static void main(String[] args) {
        System.out.println(paths("", 3, 3));
    }

    static List<String> paths(String p, int row, int col){
        if(row==1 && col==1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();

        if(row > 1){
            list.addAll(paths(p+"D", row-1, col));
        }
        if(col > 1){
            list.addAll(paths(p+"R", row, col-1));
        }

        return list;
    }
}
