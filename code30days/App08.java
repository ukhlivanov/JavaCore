package code30days;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> myMap= new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Add
            myMap.put(name,phone);
        }

        while(in.hasNext()){
            String s = in.next();
            // Show
            if (myMap.get(s)!=null){
            System.out.println(s +  "=" + myMap.get(s));}
            else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
