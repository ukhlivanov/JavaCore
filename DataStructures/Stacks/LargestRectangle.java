package DataStructures.Stacks;

import java.util.*;


public class LargestRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long res = 0, max = 0, coount=0, tmp=0;
        long[] a = new long[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        long[] b = Arrays.copyOf(a,a.length);
        Arrays.sort(b);
        max = b[0] * n;

        for (long j = b[1]; j<b[b.length-1]; j++){
            for(long k = 0; k<n; k++){
                if (a[(int) k]>=j){
                    coount++;
                }else {
                    if(tmp<coount){
                        tmp=coount;
                    }
                    coount=0;
                }

                if(k+1==n && tmp==0){
                    tmp=coount;
                }

            }
            coount=0;
            res =  j*tmp;
            tmp = 0;
            if (max<res){
                max=res;
            }
    }
        System.out.println(max);

    }
}
