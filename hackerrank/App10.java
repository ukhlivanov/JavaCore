package hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App10 {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        String inpDateStr = String.format("%s/%s/%s",month,day,year);
        Date inputDate = new SimpleDateFormat("MM/dd/yyyy").parse(inpDateStr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputDate);
        String weekDay = calendar.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.US).toUpperCase();
        System.out.println(weekDay);

    }
}
