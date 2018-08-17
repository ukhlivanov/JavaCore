package tmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class tmp1 {
    public static void main(String[] args) {
        Collection<String> listOne = new ArrayList(Arrays.asList("a","b", "c", "d", "e", "f", "g"));
        Collection<String> listTwo = new ArrayList(Arrays.asList("a","b",  "d", "e", "f", "gg", "h"));


        List<String> sourceList = new ArrayList<String>(listOne);
        List<String> destinationList = new ArrayList<String>(listTwo);


        sourceList.removeAll( listTwo );
        destinationList.removeAll( listOne );



        System.out.println( sourceList );
        System.out.println( destinationList );
    }
}
