package DataStructures.Stacks;

import java.util.*;

public class PoisonousPlants {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            long n = in.nextLong();
            ArrayList<Integer> arr = new ArrayList<>();
            long days=0;
            int diedPlants = -1;

            for (int i = 1; i<=n; i++){
                int tmp = in.nextInt();
                arr.add(tmp);
            }

            while(diedPlants!=0){
                ArrayList<Integer> delArr = new ArrayList<>();
                for (long i = 0, j = 1; j<arr.size(); i++, j++){
                    if(arr.get((int) j) > arr.get((int) i)){
                        delArr.add((int) j);
                    }
                }

                diedPlants = delArr.size();
                if(diedPlants==0){
                    break;
                }

                for (int i=0; i<delArr.size(); i++){
                    int tmp = delArr.get(i);
                    arr.set(tmp, Integer.valueOf("-1"));
                }

                for (int i=0; i<arr.size(); i++){
                    if(arr.get(i)==-1){
                        arr.remove(i);
                        i=i-1;
                    }
                }
                days++;
            }
            System.out.println(days);
        }
}
