package Interview;



import java.util.Scanner;


public class App01_Array {

    public static int[] arrayLeftRotation(int[] array, int n, int k) {

        int newArray[] = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                newArray[(i + k) % array.length] = array[i];
            }
            System.arraycopy(newArray, 0, array, 0, array.length);
        return newArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();
    }

}
