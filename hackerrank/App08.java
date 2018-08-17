package hackerrank;


import java.util.Scanner;

public class App08 {
    static Scanner sc = new Scanner(System.in);
    static boolean flag=true;
    static int H = sc.nextInt();
    static int B = sc.nextInt();

    static {
        try {
            if (H<=0 && B<=0 ){
                flag=false;
                throw new Exception("Breadth and height must be positive");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
