package DataStructures.Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Home on 7/28/2017.
 */
public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        Stack<String> stack = new Stack<>();
        List<Stack<String>> stack_;
        stack_ = new ArrayList<Stack<String>>();
        int stackCount=-1;
        for (long i=0; i<q; i++){
            int operant = in.nextInt();

            switch (operant){
                case 1 : //add
                    String add = in.next();
                    char[] arr = add.toCharArray();
                    Stack<String> tmpAdd = (Stack<String>) stack.clone();
                    for (char iterator : arr){
                        tmpAdd.push(String.valueOf(iterator));
                    }

                    stack = tmpAdd;
                    stack_.add(tmpAdd);
                    stackCount++;
                    break;

                case 2: // delete
                    int deleteNumbers = in.nextInt();
                    Stack<String> tmpDel = (Stack<String>) stack.clone();
                    while (deleteNumbers!=0){
                        tmpDel.removeElementAt(tmpDel.size()-1);
                        deleteNumbers--;
                    }

                    if(!tmpDel.equals(stack)){
                        stack = tmpDel;
                        stack_.add(tmpDel);
                        stackCount++;
                    }

                    break;

                case 3: // print
                    int showNumber = in.nextInt();
                    System.out.println(stack.get(showNumber-1));
                    break;

                case 4: // undo
                    if(stackCount==0){
                        stack_.remove(stackCount);
                        stack = new Stack<>();
                    }else{
                        stack = stack_.get(stackCount-1);
                        stack_.remove(stackCount);
                    }
                    stackCount--;
                    break;
            }
        }
    }
}
