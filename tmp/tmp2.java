package tmp;

import java.util.ArrayList;

public class tmp2 {
    public static void main(String[] args) {
        ArrayList<String> group[] = new ArrayList[15]; //Put the length of the array you need
        for(int x = 0; x < group.length; x++){
            group[x] = new ArrayList<>();
        }
        group[0].add("asd");
        group[0].add("aef");
        group[1].add("awd");
        System.out.println(group[0]);
        System.out.println(group[1]);

    }
}
