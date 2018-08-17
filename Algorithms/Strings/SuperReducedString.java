package Algorithms.Strings;


import java.util.Scanner;

public class SuperReducedString {

    public static void replace(StringBuffer str){
        int l=str.length();
        for (int i=1; i<l; i++){
            if(str.charAt(i-1) == str.charAt(i)){
                str.replace(i-1,i+1,"");
                i=0;
                l=str.length();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuffer text = new StringBuffer(str);
        replace(text);
        if (text.length()==0){
            System.out.println("Empty String");
        }else {
            System.out.println(text);
        }


    }
}
