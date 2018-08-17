package DataStructures.Arrays_LinkedList;

import java.util.Scanner;

public class AlgorithmicCrush_1 {
    public static void main(String[] args) {
        int N, M, a, b;
        long k;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        long[] differenceArray = new long[N+1];
        for (int i=0; i<M; i++)
        {
            in.nextLine();
            a = in.nextInt();
            b = in.nextInt();
            k = in.nextLong();
            differenceArray[a] += k;
            if (b+1<=N)
                differenceArray [b+1] -= k;
        }

        long max = 0, addedDifference = 0;
        for (int i=1; i<=N; i++)
        {
            addedDifference = addedDifference + differenceArray[i];
            if (max < addedDifference)
                max = addedDifference;
        }
        System.out.println(max);
        in.close();
    }
}
