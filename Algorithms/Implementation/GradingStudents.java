package Algorithms.Implementation;


import java.util.Scanner;

public class GradingStudents {
    static int[] solve(int[] grades){
        // Complete this function
        int[] result = new int[grades.length];
        for (int i=0; i<grades.length; i++){

            int c=grades[i]%5;
            int j=0;

            while (c!=0){
                j++;
                c=(grades[i]+j)%5;
            }

            if(grades[i]<37){
                result[i]=grades[i];
            }else if(j==0 || j==3 || j==4){
                result[i]=grades[i];
            }else {
                result[i]=grades[i]+j;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
