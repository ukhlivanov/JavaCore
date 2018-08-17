package code30days.App25;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++){
            intArray[i] = sc.nextInt();
        }
        ArrayList<Integer> myList = new ArrayList<>();
        int couunt=0;
        for (int i=0; i<n; i++){
            for(int j=1; j<=intArray[i]; j++){

               if(intArray[i]%j==0){
                   couunt++;
               }
            }
            myList.add(couunt);
            couunt=0;
            }

            for (Integer tmp :myList){
                if(tmp > 2 || tmp==1){
                    System.out.println("Not prime");
                }else {
                    System.out.println("Prime");
                }
            }
        }
    }


