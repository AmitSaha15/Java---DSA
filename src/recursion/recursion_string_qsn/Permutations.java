package recursion.recursion_string_qsn;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(perms("", "abc"));
    }

    static List<String> perms(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();

        for(int i=0; i<= p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());

            ans.addAll(perms(f + ch + l, up.substring(1)));
        }
        return ans;
    }
}
