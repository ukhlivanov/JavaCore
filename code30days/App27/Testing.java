package code30days.App27;

import java.util.ArrayList;
import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int n, k ,s, c=0;

        while (t-->0){
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i =0; i<n;i++){
                s=sc.nextInt();
                arr.add(s);
            }

            for(int i=0;i<arr.size();i++ ){
                if(arr.get(i) <=0){
                    c++;
                }
            }

            if(k>=c){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }


    }
}
