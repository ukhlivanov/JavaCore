package DataStructures.Stacks;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PoisonousPlants_V1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        long days=0;

        for (int i = 1; i<=n; i++){
            int tmp = in.nextInt();
            arr.add(tmp);
        }
        int i,j;

        while (!stack.empty()){

            for ( i = 0, j = 1; j<arr.size(); i++, j++){

                if(i==0){
                    stack.pop();
                }

                if(j==arr.size()-1 && (arr.get(j) > arr.get(i)) && !stack.empty() ){
                    break;
                }

                if(!stack.empty()){
                    if(stack.peek()<arr.get(j)){
                        stack.pop();
                        stack.push(arr.get(j));
                        arr.remove(j);
                    }else {
                    stack.pop();

                    }

                }else {
                    if(arr.get(j) > arr.get(i)){
                        stack.push(arr.get(j));
                        arr.remove(j);
                        i--;
                        j--;
                    }
                }

            }

            days++;
        }
        System.out.println(days-1);
    }
}
