package DataStructures.Stacks;


import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max=0;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxStack = new Stack<>();

        for(int i=1; i<=n ; i++){
            int t = in.nextInt();
            if(t==1){
                stack.push(in.nextInt());
                if(!stack.isEmpty()){
                    if(max<stack.peek()){
                        max = stack.peek();
                        maxStack.push(max);
                    }
                }

            }else if(t==2){
                int d = stack.pop();
                    if(stack.isEmpty()){
                        max=0;
                    }

                    if(d==max){
                        maxStack.pop();
                        max = maxStack.peek();
                    }

            }else {
                System.out.println(max);
            }
        }
        System.out.println("!!!!!!!!");
    }
}
