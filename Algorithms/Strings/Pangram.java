package Algorithms.Strings;


import java.util.Scanner;

public class Pangram {

    static String pangrams(String str){
        int[] lettercounts = new int[26];
        int i=0;
        String replaceString=str.replaceAll("\\s","").toLowerCase();
        for(char c : replaceString.toCharArray()){
            lettercounts[c-'a']++;
        }

        for (int j=0; j<26; j++){
            if (lettercounts[i]!=0){
                i++;
            }
        }

        if(i<26){
            return "not pangram";
        }else {
            return "pangram";
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String result = pangrams(str);
        System.out.println(result);
    }
}
