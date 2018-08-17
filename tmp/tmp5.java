package tmp;

/**
 * Created by Home on 6/13/2017.
 */
public class tmp5 {
    public static void main(String[] args) {

        int[] array = {0,1,2,3,4,5,6,7};

             for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length ; j++) {
                     System.out.print(array[i] + "," + array[j] + " ");

                 }
                 System.out.println();
             }

}}
