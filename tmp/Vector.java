package tmp;

/**
 * Created by Home on 8/6/2017.
 */
public class Vector
{
    public static void main(String[] args) {
        java.util.Vector  vector = new java.util.Vector();
        int[] arr = new int[10];

        for (int i=0; i<10; i++){
            vector.add(i);
            arr[i] =i;
        }



        System.out.println(vector);
        System.out.println(arr);
    }
}
