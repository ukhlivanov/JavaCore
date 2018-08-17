package tmp;


import java.util.Scanner;

public class tmp4 {
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] A = {a0, a1, a2};
        int[] B = {b0, b1, b2};
        int[] tmp = new int[2];
        int a=0;
        int b=0;

        for(int i=0, j=0; i<3;i++,j++){

            if(A[i]== B[j]){
                   continue;
            }else{
                if(A[i]>B[j]){
                    a++;
                }else{
                    b++;
                }
            }
        }
        tmp[0] = a;
        tmp[1] = b;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
