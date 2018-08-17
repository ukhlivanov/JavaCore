package code30days.App26;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        String date1=sc.nextLine();
        String date2=sc.nextLine();

        Date d1 = new SimpleDateFormat("dd MM yyyy").parse((date1));
        Date d2 = new SimpleDateFormat("dd MM yyyy").parse((date2));

        long one = d1.getTime();
        long two = d2.getTime();

        long diff = one - two;
        long tmp = (diff / (1000 * 60 * 60 * 24));

        if(tmp>0){
            System.out.println(15*tmp);
        }else {
            System.out.println(0);
        }

    }
}
