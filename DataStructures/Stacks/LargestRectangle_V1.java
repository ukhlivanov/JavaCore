package DataStructures.Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


public class LargestRectangle_V1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            List<Integer> heights = new ArrayList<>();
            int i=0;
            while(i<n) {
                heights.add(scanner.nextInt());
                i++;
            }
            System.out.println(areaOfLargestRectangle(heights));
        }

        public static int areaOfLargestRectangle(List<Integer> heights) {
            heights.add(0);
            Stack<Integer> stack = new Stack<>();
            int maxAreaSoFar = -1;
            for(int height : heights) {
                int n = 0;
                while(!stack.isEmpty() && stack.peek() > height) {
                    n++;
                    maxAreaSoFar = Math.max(maxAreaSoFar, n* stack.pop());
                }
                for(int i = 0; i < n+1; i++) {
                    stack.push(height);
                }
            }
            return maxAreaSoFar;
        }
}
