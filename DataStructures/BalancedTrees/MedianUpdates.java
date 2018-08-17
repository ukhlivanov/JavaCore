package DataStructures.BalancedTrees;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedianUpdates {

    public static void sortAndShow(ArrayList<Integer> result){

        Collections.sort(result);
        if(result.size()%2 ==0){
            int tmp = result.size()/2;
            long l1 = result.get(tmp);
            long l2 = result.get(tmp-1);
            long l3 = l1 + l2;
            BigDecimal r = new BigDecimal(l3*0.5);
            System.out.println(r.toString());
        }else {
            int tmp = result.size()/2;
            long res = result.get(tmp);
                System.out.println(res);

        }

    }

    static void median(String s[],int x[]) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i=0; i<x.length; i++){
            String element = s[i];

            //remove
            if("r".equals(element)){
                for(int j=0; j<x.length; j++){

                    try {
                        if(x[i] == result.get(j)){
                            result.remove(j);
                            sortAndShow(result);
                            break;
                        }
                    }catch (Exception e){
                        System.out.println("Wrong");
                        break;
                    }


//                    if(result.isEmpty()){
//                        System.out.println("Wrong");
//                        break;
//                    }
//
//                    if(x[i] == result.get(j)){
//                        result.remove(j);
//                        if(result.isEmpty()){
//                            System.out.println("Wrong");
//                            break;
//                        }
//                        sortAndShow(result);
//                        break;
//                    }else if(j==result.size()-1){
//                        System.out.println("Wrong");
//                        break;
//                        }
                }

                //add
            }else {

                result.add(Integer.valueOf(x[i]));
               sortAndShow(result);
            }
        }

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
