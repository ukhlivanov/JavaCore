package DataStructures.Stacks;

import java.util.*;

public class EqualStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        Queue<Integer> stack1 = new LinkedList<>();
        Queue<Integer> stack2 = new LinkedList<>();
        Queue<Integer> stack3 = new LinkedList<>();
        long sum1=0;
        long sum2=0;
        long sum3=0;

        for(int h1_i=0; h1_i < n1; h1_i++){
            int tmp = in.nextInt();
            stack1.add(tmp);
            sum1 = sum1 + tmp;
        }

        for(int h2_i=0; h2_i < n2; h2_i++){
            int tmp = in.nextInt();
            stack2.add(tmp);
            sum2 = sum2 + tmp;
        }

        for(int h3_i=0; h3_i < n3; h3_i++){
            int tmp = in.nextInt();
            stack3.add(tmp);
            sum3 = sum3 + tmp;
        }


        for(int i=0; i< Integer.MAX_VALUE; i++){

            if( sum1 > sum2 && sum1 > sum3 ){
                stack1.poll();
                sum1 = sumArr(new ArrayList<>(stack1));
            }
            if(sum2 > sum3 && sum2 > sum1) {
                stack2.poll();
                sum2 = sumArr(new ArrayList<>(stack2));
            }
            if(sum3 > sum2 && sum3 > sum1 ){
                stack3.poll();
                sum3 = sumArr(new ArrayList<>(stack3));
            }

            if(stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty() ){
                sum1=0;
                break;
            }

            if(sum1==sum2 && sum2==sum3){
                break;
            }
        }
        System.out.println(sum1);
    }



    public static long sumArr(ArrayList<Integer> m)
    {
        long sum = 0;
        for(int i = 0; i < m.size(); i++)
        {
            sum = sum + m.get(i);
        }
        return sum;
    }
}
