package DataStructures.BalancedTrees;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

import java.util.Scanner;

/**
 * Created by Home on 7/17/2017.
 */
public class MedianUpdates_MultiSet {

    static void median(String s[],int x[]) {

        Multiset<String> multiset = HashMultiset.create();


    }

    public static void main( String args[] ){
        Scanner in = new Scanner(System.in);

        int N;
        N = in.nextInt();

        String s[] = new String[N];
        int x[] = new int[N];

        for(int i=0; i<N; i++){
            s[i] = in.next();
            x[i] = in.nextInt();
        }

        median(s,x);
    }
}
