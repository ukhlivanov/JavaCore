package hackerrank;


import java.util.Scanner;

public class App18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        //Complete the code
        s = s.trim();
        if (s.length()>400000){
            return ;
        }else if (s.length()==0){
            System.out.println(0);
            return ;
        }else{
            String[] words = s.split("[!,?.*_'@\\ ]+");
            int count = words.length;
            System.out.println(count);
            for(String word : words){
                System.out.println(word);
            }
        }
    }
}
